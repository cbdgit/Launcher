/*
 *  Copyright (c) 2016.  Project Launcher
 *  Source AnimateUtils
 *  Author 沈煜
 *  此源码及相关文档等附件由 沈煜 编写，作者保留所有权利
 *  使用必须注明出处。
 *  The code and documents is write by the author. All rights are reserved.
 *  Use must indicate the source.
 *
 */

package com.open.androidtvwidget.utils;

import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/**
 * 动画集合.
 * 
 * @author hailongqiu 356752238@qq.com
 *
 */
public class AnimateUtils {
	public static Animation zoomAnimation(float startScale, float endScale, long duration) {
		ScaleAnimation anim = new ScaleAnimation(startScale, endScale, startScale, endScale, Animation.RELATIVE_TO_SELF,
				0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
		anim.setFillAfter(true);
		anim.setDuration(duration);
		return anim;
	}
}
