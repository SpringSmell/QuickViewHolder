package com.example.quickviewholdersample

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.*
import org.quick.viewHolder.QuickVHService
import org.quick.viewHolder.QuickVH

class BaseVH(itemView: View, var VH: QuickVH= QuickVH(itemView)):QuickVHService {
    override fun <T : View> getView(id: Int): T? =VH.getView(id)

    override fun setText(
        id: Int,
        content: CharSequence?,
        onClickListener: ((view: View, VHService: QuickVHService) -> Unit)?
    ): QuickVHService =VH.setText(id,content,onClickListener)

    override fun setImg(
        id: Int,
        iconId: Int,
        onClickListener: ((view: View, VHService: QuickVHService) -> Unit)?
    ): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setImg(
        id: Int,
        url: CharSequence,
        onClickListener: ((view: View, VHService: QuickVHService) -> Unit)?
    ): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setImgRoundRect(
        id: Int,
        radius: Float,
        iconId: Int,
        onClickListener: ((view: View, VHService: QuickVHService) -> Unit)?
    ): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setImgRoundRect(
        id: Int,
        radius: Float,
        url: CharSequence,
        onClickListener: ((view: View, VHService: QuickVHService) -> Unit)?
    ): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setImgCircle(
        id: Int,
        url: CharSequence,
        onClickListener: ((view: View, VHService: QuickVHService) -> Unit)?
    ): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setImgCircle(
        id: Int,
        imgRes: Int,
        onClickListener: ((view: View, VHService: QuickVHService) -> Unit)?
    ): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bindImgCircle(context: Context, url: String, imageView: ImageView?): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bindImg(context: Context, url: String, imageView: ImageView?): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bindImgRoundRect(
        context: Context,
        url: String,
        radius: Float,
        imageView: ImageView?
    ): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setOnClickListener(
        onClickListener: (view: View, VHService: QuickVHService) -> Unit,
        vararg ids: Int
    ): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setOnClickListener(
        onClickListener: (view: View, VHService: QuickVHService) -> Unit,
        id: Int
    ): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setProgress(id: Int, value: Int): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setCheck(id: Int, isChecked: Boolean): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBackgroundResource(id: Int, bgResId: Int): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBackground(id: Int, background: Drawable): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBackgroundColor(id: Int, background: Int): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setVisibility(visibility: Int, vararg resIds: Int): QuickVHService {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTextView(id: Int): TextView? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getButton(id: Int): Button? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getImageView(id: Int): ImageView? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLinearLayout(id: Int): LinearLayout? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRelativeLayout(id: Int): RelativeLayout? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFramLayout(id: Int): FrameLayout? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCheckBox(id: Int): CheckBox? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEditText(id: Int): EditText? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}