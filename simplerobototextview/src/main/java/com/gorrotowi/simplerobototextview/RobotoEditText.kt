package com.gorrotowi.simplerobototextview

import android.content.Context
import android.text.InputFilter
import android.util.AttributeSet
import android.widget.EditText

/**
 * @author gorrotowi on 25/03/16.
 */
class RobotoEditText @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : EditText(context, attrs) {

    init {
        if (!isInEditMode) {
            RobotoFontManager(context).initStyle(this, attrs)
        }
    }

    fun setMaxtLengt(length: Int) {
        val filterArray = arrayOfNulls<InputFilter>(1)
        filterArray[0] = InputFilter.LengthFilter(length)
        this.filters = filterArray
    }

}