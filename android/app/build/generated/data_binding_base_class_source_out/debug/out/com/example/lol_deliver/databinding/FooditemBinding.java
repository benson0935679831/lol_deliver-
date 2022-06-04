// Generated by view binder compiler. Do not edit!
package com.example.lol_deliver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.lol_deliver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FooditemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivSkFoodIcon;

  @NonNull
  public final TextView tvFoodDetail;

  @NonNull
  public final TextView tvFoodName;

  @NonNull
  public final TextView tvFoodPrice;

  private FooditemBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivSkFoodIcon,
      @NonNull TextView tvFoodDetail, @NonNull TextView tvFoodName, @NonNull TextView tvFoodPrice) {
    this.rootView = rootView;
    this.ivSkFoodIcon = ivSkFoodIcon;
    this.tvFoodDetail = tvFoodDetail;
    this.tvFoodName = tvFoodName;
    this.tvFoodPrice = tvFoodPrice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FooditemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FooditemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fooditem, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FooditemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_sk_foodIcon;
      ImageView ivSkFoodIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivSkFoodIcon == null) {
        break missingId;
      }

      id = R.id.tv_foodDetail;
      TextView tvFoodDetail = ViewBindings.findChildViewById(rootView, id);
      if (tvFoodDetail == null) {
        break missingId;
      }

      id = R.id.tv_foodName;
      TextView tvFoodName = ViewBindings.findChildViewById(rootView, id);
      if (tvFoodName == null) {
        break missingId;
      }

      id = R.id.tv_foodPrice;
      TextView tvFoodPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvFoodPrice == null) {
        break missingId;
      }

      return new FooditemBinding((LinearLayout) rootView, ivSkFoodIcon, tvFoodDetail, tvFoodName,
          tvFoodPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
