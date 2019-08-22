package com.example.quickviewholdersample

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import org.quick.viewHolder.ViewHolder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewHolder=ViewHolder(LayoutInflater.from(this).inflate(R.layout.activity_main,null))
        viewHolder.setText(R.id.text,"") { view, viewHolder ->

        }
    }

    class VHService(view:View, var quickViewHolder:BaseVH=BaseVH(view)): org.quick.viewHolder.VHService {
        override fun <T : View> getView(id: Int): T? =quickViewHolder.getView<T>(id)

        override fun setText(
            id: Int,
            content: CharSequence?,
            onClickListener: ((view: View, VHService: org.quick.viewHolder.VHService) -> Unit)?
        ): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImg(
            id: Int,
            iconId: Int,
            onClickListener: ((view: View, VHService: org.quick.viewHolder.VHService) -> Unit)?
        ): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImg(
            id: Int,
            url: CharSequence,
            onClickListener: ((view: View, VHService: org.quick.viewHolder.VHService) -> Unit)?
        ): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImgRoundRect(
            id: Int,
            radius: Float,
            iconId: Int,
            onClickListener: ((view: View, VHService: org.quick.viewHolder.VHService) -> Unit)?
        ): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImgRoundRect(
            id: Int,
            radius: Float,
            url: CharSequence,
            onClickListener: ((view: View, VHService: org.quick.viewHolder.VHService) -> Unit)?
        ): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImgCircle(
            id: Int,
            url: CharSequence,
            onClickListener: ((view: View, VHService: org.quick.viewHolder.VHService) -> Unit)?
        ): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setImgCircle(
            id: Int,
            imgRes: Int,
            onClickListener: ((view: View, VHService: org.quick.viewHolder.VHService) -> Unit)?
        ): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun bindImgCircle(context: Context, url: String, imageView: ImageView?): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun bindImg(context: Context, url: String, imageView: ImageView?): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun bindImgRoundRect(
            context: Context,
            url: String,
            radius: Float,
            imageView: ImageView?
        ): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setOnClickListener(
            onClickListener: (view: View, VHService: org.quick.viewHolder.VHService) -> Unit,
            vararg ids: Int
        ): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setOnClickListener(
            onClickListener: (view: View, VHService: org.quick.viewHolder.VHService) -> Unit,
            id: Int
        ): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setProgress(id: Int, value: Int): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setCheck(id: Int, isChecked: Boolean): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setBackgroundResource(id: Int, bgResId: Int): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setBackground(id: Int, background: Drawable): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setBackgroundColor(id: Int, background: Int): org.quick.viewHolder.VHService {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setVisibility(visibility: Int, vararg resIds: Int): org.quick.viewHolder.VHService {
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
}
