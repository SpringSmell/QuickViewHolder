package com.example.quickviewholdersample

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import org.quick.viewHolder.VHService
import org.quick.viewHolder.ViewHolder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewHolder=ViewHolder(LayoutInflater.from(this).inflate(R.layout.activity_main,null))
        viewHolder.setText(R.id.text,"") { view, viewHolder ->

        }
    }

    class BaseViewHolder(view:View, var quickViewHolder:BaseVH=BaseVH(view)): VHService {
        override fun setText(
            id: Int,
            content: CharSequence?,
            onClickListener: ((view: View, vh: ViewHolder) -> Unit)?
        ): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImg(
            id: Int,
            iconId: Int,
            onClickListener: ((view: View, vh: ViewHolder) -> Unit)?
        ): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImg(
            id: Int,
            url: CharSequence,
            onClickListener: ((view: View, vh: ViewHolder) -> Unit)?
        ): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImgRoundRect(
            id: Int,
            radius: Float,
            iconId: Int,
            onClickListener: ((view: View, vh: ViewHolder) -> Unit)?
        ): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImgRoundRect(
            id: Int,
            radius: Float,
            url: CharSequence,
            onClickListener: ((view: View, vh: ViewHolder) -> Unit)?
        ): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImgCircle(
            id: Int,
            url: CharSequence,
            onClickListener: ((view: View, vh: ViewHolder) -> Unit)?
        ): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImgCircle(
            id: Int,
            imgRes: Int,
            onClickListener: ((view: View, vh: ViewHolder) -> Unit)?
        ): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun bindImgCircle(
            context: Context,
            url: String,
            imageView: ImageView?
        ): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun bindImg(context: Context, url: String, imageView: ImageView?): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun bindImgRoundRect(
            context: Context,
            url: String,
            radius: Float,
            imageView: ImageView?
        ): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setOnClick(
            onClickListener: (view: View, vh: ViewHolder) -> Unit,
            vararg ids: Int
        ): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setProgress(id: Int, value: Int): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setCheck(id: Int, isChecked: Boolean): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setBackgroundResource(id: Int, bgResId: Int): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setBackground(id: Int, background: Drawable): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setBackgroundColor(id: Int, background: Int): VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setVisibility(visibility: Int, vararg resIds: Int): VHService {
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

        override fun <T : View> getView(id: Int): T? =quickViewHolder.getView<T>(id)


    }
}
