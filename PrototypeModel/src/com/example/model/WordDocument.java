package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class WordDocument implements Cloneable {

	private String mText;
	private List<String> mImages = new ArrayList<String>();
	
	
	public String getmText() {
		return mText;
	}


	public void setmText(String mText) {
		this.mText = mText;
	}


	public List<String> getmImages() {
		return mImages;
	}


	public void setmImages(List<String> mImages) {
		this.mImages = mImages;
	}

	public void addImages(String ima){
		mImages.add(ima);
	}

	protected WordDocument clone(){
		try {
			WordDocument doc = (WordDocument) super.clone();
			doc.mText  = this.mText;
			doc.mImages = this.mImages;
			return doc;
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public void show(){
		for(String name:mImages){
			System.out.println(name);
		}
	}
	
}
