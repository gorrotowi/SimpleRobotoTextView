package com.gorrotowi.simplerobototextview

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText

/**
 * @author gorrotowi on 25/03/16.
 */
class RobotoEditText : EditText {
    constructor(context: Context) : super(context) {
        RobotoFontManager(context).initStyle(this)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        if (!isInEditMode) {
            RobotoFontManager(context).initStyle(this, attrs)
        }
    }

    fun setMaxLength(length: Int) {
        val FilterArray = arrayOfNulls<InputFilter>(1)
        FilterArray[0] = InputFilter.LengthFilter(length)
        this.filters = FilterArray
    }
}