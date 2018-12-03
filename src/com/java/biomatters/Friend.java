package com.java.biomatters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    @Override
	public String toString() {
		return "Friend [friends=" + friends + ", email=" + email + "]";
	}

	/*
     * A -> B, B -> C
     * a.canBeConnected(C);
     * 
     * a get friends list
     * 
     * C can be connected if it is present in any of A's Friendlist
     * 
     * steps get a's friendlist
     * search c in friendslist
     * if found return true
     * else false
     * 
     * 
     */
    public boolean canBeConnected(Friend friend) {
    	List<Friend> collect = friends.parallelStream().filter((element) -> element.equals(friend))
        .collect(Collectors.toList());
    	
    	if(collect.size()>1) {
    		return true;
    	}else {
    		for(Friend friends: friends) {
        		return isFriendPresent(friends.friends, friend);
    		}
    	}
    	return false;
    }

	private boolean isFriendPresent(Collection<Friend> friends, Friend friendToSearch) {
		if(friends.contains(friendToSearch)) {
    		return true;
    	}else {
    		for(Friend friend: friends) {
        		return isFriendPresent(friend.friends, friendToSearch);
    		}
    	}
    	
    	return false;
	}

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");
        Friend d = new Friend("d");
        Friend e = new Friend("e");

        a.addFriendship(b);
        b.addFriendship(c);
        a.addFriendship(e);

        System.out.println(c.canBeConnected(e));
    }
}
