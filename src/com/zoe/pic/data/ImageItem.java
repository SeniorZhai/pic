package com.zoe.pic.data;

import java.io.Serializable;

// ͼƬ���л�����
public class ImageItem implements Serializable {
	public String imageId;
	public String thumbnailPath;
	public String imagePath;
	public boolean isSelected = false;
}
