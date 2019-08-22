package org.quick.viewHolder

import android.annotation.TargetApi
import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
import android.widget.*
import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.annotation.NonNull

interface VHService {
    fun <T : View> getView(@IdRes id: Int): T? 

    fun setText(@IdRes id: Int, content: CharSequence?, onClickListener: ((view: View, VHService: VHService) -> Unit)? = null): VHService

    /**
     * 原样本地图片
     *
     * @param id
     * @param iconId
     * @return
     */
    fun setImg(@IdRes id: Int, @DrawableRes iconId: Int, onClickListener: ((view: View, VHService: VHService) -> Unit)? = null): VHService

    /**
     * 原样网络图片
     *
     * @param id
     * @param url
     * @return
     */
    fun setImg(@IdRes id: Int, url: CharSequence, onClickListener: ((view: View, VHService: VHService) -> Unit)? = null): VHService


    /**
     * 圆角-本地图片
     *
     * @param id
     * @param radius
     * @param iconId
     * @return
     */
    fun setImgRoundRect(@IdRes id: Int, radius: Float, @DrawableRes iconId: Int, onClickListener: ((view: View, VHService: VHService) -> Unit)? = null): VHService

    /**
     * 圆角-网络图片
     *
     * @param id
     * @param radius
     * @param url
     * @return
     */
    fun setImgRoundRect(@IdRes id: Int, radius: Float, url: CharSequence, onClickListener: ((view: View, VHService: VHService) -> Unit)? = null): VHService


    /**
     * 圆形-网络图片
     *
     * @param id
     * @param url
     * @param onClickListener
     * @return
     */
    fun setImgCircle(@IdRes id: Int, url: CharSequence, onClickListener: ((view: View, VHService: VHService) -> Unit)? = null): VHService

    /**
     * 圆形-本地图片
     *
     */
    fun setImgCircle(@IdRes id: Int, @DrawableRes imgRes: Int, onClickListener: ((view: View, VHService: VHService) -> Unit)? = null): VHService


    fun bindImgCircle(context: Context, url: String, imageView: ImageView?): VHService

    fun bindImg(context: Context, url: String, imageView: ImageView?): VHService

    fun bindImgRoundRect(context: Context, url: String, radius: Float, imageView: ImageView?): VHService

    fun setOnClickListener(onClickListener: (view: View, VHService: VHService) -> Unit, @IdRes vararg ids: Int): VHService

    fun setOnClickListener(onClickListener: (view: View, VHService: VHService) -> Unit, @IdRes id: Int): VHService

    fun setProgress(@IdRes id: Int, value: Int): VHService

    fun setCheck(@IdRes id: Int, isChecked: Boolean): VHService

    fun setBackgroundResource(@IdRes id: Int, bgResId: Int): VHService

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    fun setBackground(@IdRes id: Int, background: Drawable): VHService

    fun setBackgroundColor(@IdRes id: Int, background: Int): VHService

    fun setVisibility(visibility: Int, @NonNull @IdRes vararg resIds: Int): VHService

    fun getTextView(@IdRes id: Int): TextView? 
    fun getButton(@IdRes id: Int): Button? 

    fun getImageView(@IdRes id: Int): ImageView? 

    fun getLinearLayout(@IdRes id: Int): LinearLayout?

    fun getRelativeLayout(@IdRes id: Int): RelativeLayout?

    fun getFramLayout(@IdRes id: Int): FrameLayout? 

    fun getCheckBox(@IdRes id: Int): CheckBox?

    fun getEditText(@IdRes id: Int): EditText?
}
