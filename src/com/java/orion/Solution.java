package com.java.orion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
	
	public static String solution(String S) throws ParseException {
		String[] split = S.split("\\r?\\n");
		List<PhotoWrapper> photoList= prepareObjectList(split);
		giveNameToPhotoList(photoList);
		sortPhotosToOriginalOrder(photoList);
		
		StringBuilder sb=new StringBuilder();
        for (PhotoWrapper img:photoList) {
            sb.append(img.newName);
            sb.append("\n");
        }
        
		return sb.toString();
	}
	
	private static void sortPhotosToOriginalOrder(List<PhotoWrapper> photoList) {
		Collections.sort(photoList, new Comparator<PhotoWrapper>() {
            @Override
            public int compare(PhotoWrapper o1, PhotoWrapper o2) {
                return o1.order-o2.order;
            }
        });
	}

	private static void giveNameToPhotoList(List<PhotoWrapper> photoList) {
		Collections.sort(photoList, new Comparator<PhotoWrapper>() {
            @Override
            public int compare(PhotoWrapper o1, PhotoWrapper o2) {
                return o1.date.compareTo(o2.date);
            }
        });
		Map<String, Integer> chkMap = new HashMap<>();
		for(PhotoWrapper photo: photoList) {
			int counter=0;
			if(chkMap.containsKey(photo.location)) {
				counter=chkMap.get(photo.location)+1;
			}else {
				chkMap.put(photo.location,counter);
			}
			photo.newName = photo.newName.replace("#NUM#", String.format("%02d",counter));
		}
	}

	private static List<PhotoWrapper> prepareObjectList(String[] split){
		List<PhotoWrapper> photoList = new LinkedList<PhotoWrapper>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		PhotoWrapper pw;
		String[] photoSplit;
		for(int i=0;i<split.length;i++) {
			photoSplit = split[i].split(",");
			String ext = photoSplit[0].substring(photoSplit[0].indexOf(".")+1, photoSplit[0].length());
			String name = photoSplit[0];
			String location = photoSplit[1];
			String source = photoSplit[2];
			
			try {
				pw = new PhotoWrapper(i,name,ext, location, sdf.parse(source));
				photoList.add(pw);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return photoList;
	}

	public static void main(String[] args) throws ParseException {
		String q = "photo.jpg, Warsaw, 2013-09-05 14:08:15\r\n" + 
				"john.png, London, 2015-06-20 15:13:22\r\n" + 
				"myFriends.png, Warsaw, 2013-09-05 14:07:13\r\n" + 
				"Eiffel.jpg, Paris, 2015-07-23 08:03:02\r\n" + 
				"pisatower.jpg, Paris, 2015-07-22 23:59:59\r\n" + 
				"BOB.jpg, London, 2015-08-05 00:02:03\r\n" + 
				"";
		System.out.println(solution(q));
	}
}
/*
 * photo.jpg, Warsaw, 2013-09-05 14:08:15 
 * john.png, London, 2015-06-20 15:13:22
 * myFriends.png, Warsaw, 2013-09-05 14:07:13
 * 
 * get photo's start numbering
 * 
 * Warsaw
 */
class PhotoWrapper{
	String name;
	String extension;
	String location;
	int order;
	Date date;
	String newName;
	public PhotoWrapper(int order, String name, String extension, String location, Date date) {
		super();
		this.order=order;
		this.name = name;
		this.extension = extension;
		this.location = location;
		this.date = date;
		this.newName=location+"#NUM#."+extension;
	}
	@Override
	public String toString() {
		return "photoWrapper [name=" + name + ", extension=" + extension + ", location=" + location + ", order=" + order
				+ ", date=" + date + ", newName=" + newName + "]";
	}
	
}