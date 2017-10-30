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
    /**
     * Init custom font to view
     * @param view you want asing font
     * @param attrs attributeset with value of font, can be null
     */
    fun initStyle(view: View, attrs: AttributeSet? = null) {

        if (attrs != null) {
            val typedArray = context?.theme?.obtainStyledAttributes(attrs, R.styleable.roboto_font, 0, 0)
            val tp: Typeface = when (typedArray?.getInteger(R.styleable.roboto_font_font, 0)) {
                0 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-Black.ttf")
                1 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-BlackItalic.ttf")
                2 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-Bold.ttf")
                3 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-BoldItalic.ttf")
                4 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-Italic.ttf")
                5 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-Light.ttf")
                6 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-LightItalic.ttf")
                7 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-Medium.ttf")
                8 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-MediumItalic.ttf")
                9 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-Regular.ttf")
                10 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-Thin.ttf")
                11 -> Typeface.createFromAsset(context?.assets, "fonts/Roboto-ThinItalic.ttf")
                12 -> Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-Bold.ttf")
                13 -> Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-BoldItalic.ttf")
                14 -> Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-Italic.ttf")
                15 -> Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-Light.ttf")
                16 -> Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-LightItalic.ttf")
                17 -> Typeface.createFromAsset(context?.assets, "fonts/RobotoCondensed-Regular.ttf")
                else -> {
                    Typeface.createFromAsset(context?.assets, "fonts/Roboto-Regular.ttf")
                }
            }
            typedArray?.recycle()
            setTypeFace(view, tp)
        } else {
            setTypeFace(view)
        }
    }

    /**
     * This function asing typeface to view
     * @param view view you want asing the typeface font
     * @param tp this is the typeface, , can be null
     */
    fun setTypeFace(view: View, tp: Typeface = Typeface.createFromAsset(context?.assets, "fonts/Roboto-Regular.ttf")) {
        when (view) {
            is TextView -> view.typeface = tp
            is EditText -> view.typeface = tp
            is Button -> view.typeface = tp
        }
    }
}
