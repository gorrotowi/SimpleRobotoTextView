package com.gorrotowi.simplerobototextview

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/**
 * @author gorrotowi on 25/03/16.
 */
class RobotoFontManager(val context: Context?) {
    fun initStyle(view: View) {
        setTypeFace(view)
    }

    fun initStyle(view: View, attrs: AttributeSet) {
        val typedArray = context?.theme?.obtainStyledAttributes(attrs, R.styleable.roboto_font, 0, 0)
        var tp: Typeface
        when (typedArray?.getInteger(R.styleable.roboto_font_font, 0)) {
            0 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-Black.ttf")
            1 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-BlackItalic.ttf")
            2 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-Bold.ttf")
            3 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-BoldItalic.ttf")
            4 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-Italic.ttf")
            5 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-Light.ttf")
            6 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-LightItalic.ttf")
            7 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-Medium.ttf")
            8 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-MediumItalic.ttf")
            9 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-Regular.ttf")
            10 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-Thin.ttf")
            11 -> tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-ThinItalic.ttf")
            12 -> tp = Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-Bold.ttf")
            13 -> tp = Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-BoldItalic.ttf")
            14 -> tp = Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-Italic.ttf")
            15 -> tp = Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-Light.ttf")
            16 -> tp = Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-LightItalic.ttf")
            17 -> tp = Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-Regular.ttf")
            else -> {
                tp = Typeface.createFromAsset(context?.assets, "fonts/Roboto-Regular.ttf")
            }
        }
        typedArray?.recycle()
        setTypeFace(view, tp)
    }

    fun setTypeFace(view: View, tp: Typeface = Typeface.createFromAsset(context?.assets, "fonts/Roboto-Regular.ttf")) {
        when (view) {
            is TextView -> view.typeface = tp
            is EditText -> view.typeface = tp
            is Button -> view.typeface = tp
        }
    }
}
