package kr.hs.e_mirim.politicsteens;

import android.graphics.drawable.Drawable;

/**
 * Created by User on 2017-06-19.
 */

public class PostItem {
   private int post_image;

   public PostItem(int post_image)
   {
      this.post_image=post_image;
   }

   public int getPost_image() { return post_image; }

   public void setPost_image(int post_image) { this.post_image= post_image; }

}
