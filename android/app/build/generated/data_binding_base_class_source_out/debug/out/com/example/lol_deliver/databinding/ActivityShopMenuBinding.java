// Generated by view binder compiler. Do not edit!
package com.example.lol_deliver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.lol_deliver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityShopMenuBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View divider3;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView ivMenuBack;

  @NonNull
  public final ImageView ivMenuShopIcon;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ListView lvMenu;

  @NonNull
  public final TextView tvMenuComment;

  @NonNull
  public final TextView tvMenuListener;

  @NonNull
  public final TextView tvMenuMoreBtn;

  @NonNull
  public final TextView tvMenuRefactorBtn;

  @NonNull
  public final TextView tvMenuShopDistance;

  @NonNull
  public final TextView tvMenuShopLowConsume;

  @NonNull
  public final TextView tvMenuShopName;

  @NonNull
  public final TextView tvMenuTransTime;

  private ActivityShopMenuBinding(@NonNull ConstraintLayout rootView, @NonNull View divider3,
      @NonNull ImageView imageView3, @NonNull ImageView ivMenuBack,
      @NonNull ImageView ivMenuShopIcon, @NonNull LinearLayout linearLayout,
      @NonNull ListView lvMenu, @NonNull TextView tvMenuComment, @NonNull TextView tvMenuListener,
      @NonNull TextView tvMenuMoreBtn, @NonNull TextView tvMenuRefactorBtn,
      @NonNull TextView tvMenuShopDistance, @NonNull TextView tvMenuShopLowConsume,
      @NonNull TextView tvMenuShopName, @NonNull TextView tvMenuTransTime) {
    this.rootView = rootView;
    this.divider3 = divider3;
    this.imageView3 = imageView3;
    this.ivMenuBack = ivMenuBack;
    this.ivMenuShopIcon = ivMenuShopIcon;
    this.linearLayout = linearLayout;
    this.lvMenu = lvMenu;
    this.tvMenuComment = tvMenuComment;
    this.tvMenuListener = tvMenuListener;
    this.tvMenuMoreBtn = tvMenuMoreBtn;
    this.tvMenuRefactorBtn = tvMenuRefactorBtn;
    this.tvMenuShopDistance = tvMenuShopDistance;
    this.tvMenuShopLowConsume = tvMenuShopLowConsume;
    this.tvMenuShopName = tvMenuShopName;
    this.tvMenuTransTime = tvMenuTransTime;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityShopMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityShopMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_shop_menu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityShopMenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider3;
      View divider3 = ViewBindings.findChildViewById(rootView, id);
      if (divider3 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.iv_menu_back;
      ImageView ivMenuBack = ViewBindings.findChildViewById(rootView, id);
      if (ivMenuBack == null) {
        break missingId;
      }

      id = R.id.iv_menu_shopIcon;
      ImageView ivMenuShopIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivMenuShopIcon == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.lv_menu;
      ListView lvMenu = ViewBindings.findChildViewById(rootView, id);
      if (lvMenu == null) {
        break missingId;
      }

      id = R.id.tv_menu_comment;
      TextView tvMenuComment = ViewBindings.findChildViewById(rootView, id);
      if (tvMenuComment == null) {
        break missingId;
      }

      id = R.id.tv_menu_listener;
      TextView tvMenuListener = ViewBindings.findChildViewById(rootView, id);
      if (tvMenuListener == null) {
        break missingId;
      }

      id = R.id.tv_menu_moreBtn;
      TextView tvMenuMoreBtn = ViewBindings.findChildViewById(rootView, id);
      if (tvMenuMoreBtn == null) {
        break missingId;
      }

      id = R.id.tv_menu_refactorBtn;
      TextView tvMenuRefactorBtn = ViewBindings.findChildViewById(rootView, id);
      if (tvMenuRefactorBtn == null) {
        break missingId;
      }

      id = R.id.tv_menu_shopDistance;
      TextView tvMenuShopDistance = ViewBindings.findChildViewById(rootView, id);
      if (tvMenuShopDistance == null) {
        break missingId;
      }

      id = R.id.tv_menu_shopLowConsume;
      TextView tvMenuShopLowConsume = ViewBindings.findChildViewById(rootView, id);
      if (tvMenuShopLowConsume == null) {
        break missingId;
      }

      id = R.id.tv_menu_shopName;
      TextView tvMenuShopName = ViewBindings.findChildViewById(rootView, id);
      if (tvMenuShopName == null) {
        break missingId;
      }

      id = R.id.tv_menu_transTime;
      TextView tvMenuTransTime = ViewBindings.findChildViewById(rootView, id);
      if (tvMenuTransTime == null) {
        break missingId;
      }

      return new ActivityShopMenuBinding((ConstraintLayout) rootView, divider3, imageView3,
          ivMenuBack, ivMenuShopIcon, linearLayout, lvMenu, tvMenuComment, tvMenuListener,
          tvMenuMoreBtn, tvMenuRefactorBtn, tvMenuShopDistance, tvMenuShopLowConsume,
          tvMenuShopName, tvMenuTransTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
