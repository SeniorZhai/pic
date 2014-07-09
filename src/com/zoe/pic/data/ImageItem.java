package com.zoe.pic.data;

import java.io.Serializable;

// 图片序列化对象
public class ImageItem implements Serializable {
	public String imageId;
	public String thumbnailPath;
	public String imagePath;
	public boolean isSelected = false;
}
