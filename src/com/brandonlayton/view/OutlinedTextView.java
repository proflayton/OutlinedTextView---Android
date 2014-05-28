package com.brandonlayton.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

public class OutlinedTextView extends TextView {

	private String strokeColor = "#000";
	private int strokeWidth = 3;
	private TextPaint paint = null;
	
	public OutlinedTextView(Context context){
		super(context);
	}
	
	public OutlinedTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		if(attrs == null) return;
		
		String packageName = "http://schemas.android.com/apk/res-auto"; 
		strokeWidth = attrs.getAttributeIntValue(packageName, "stroke_width", 1);
		strokeColor = attrs.getAttributeValue(packageName, "stroke_color");
		if(strokeColor == null){
			strokeColor = "#222222";
		}
	}
	
	public void setStrokeColor(String strokeColor) {
		this.strokeColor = strokeColor;
	}
	public String getStrokeColor(){
		return this.strokeColor;
	}
	
	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}
	public int getStrokeWidth(){
		return this.strokeWidth;
	}
 
	@Override
	protected void onDraw(Canvas canvas){
		if(paint == null) paint = new TextPaint();
		
		TextPaint otherPaint = getPaint();
		paint.setTextSize(otherPaint.getTextSize());
		paint.setTypeface(otherPaint.getTypeface());
		paint.setFlags(otherPaint.getFlags());
		paint.setAlpha(otherPaint.getAlpha());
		
		paint.setStyle(Paint.Style.STROKE);
		try{
			paint.setColor(Color.parseColor(strokeColor));
		} catch (Exception e) { paint.setColor(Color.BLACK); }
		paint.setStrokeWidth(strokeWidth);
		
		String text = getText().toString();
		canvas.drawText(text, (getWidth() - paint.measureText(text))/2, getBaseline(), paint);
		super.onDraw(canvas);
	}
	
}
