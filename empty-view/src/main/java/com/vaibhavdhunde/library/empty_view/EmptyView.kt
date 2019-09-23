@file:Suppress("unused")

package com.vaibhavdhunde.library.empty_view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class EmptyView(
    context: Context,
    attributeSet: AttributeSet
) : LinearLayout(context, attributeSet) {

    var emptyImageView: ImageView
    var emptyTitleView: TextView
    var emptySubtitleView: TextView

    private var emptyImage: Int = 0
    private var emptyTitle: String? = ""
    private var emptySubtitle: String? = ""

    init {
        // get the compound view by inflating it
        val emptyView = LayoutInflater.from(context)
            .inflate(R.layout.empty_view, this)

        // initialize the views in the compound view
        emptyImageView = emptyView.findViewById(R.id.empty_image)
        emptyTitleView = emptyView.findViewById(R.id.empty_title)
        emptySubtitleView = emptyView.findViewById(R.id.empty_subtitle)

        // get the styled attributes
        val attributes = context.obtainStyledAttributes(attributeSet, R.styleable.EmptyView)

        // get the empty image (default is @drawable/ic_android)
        emptyImage =
            attributes.getResourceId(R.styleable.EmptyView_empty_image, R.drawable.ic_android)
        // get the empty title
        emptyTitle = attributes.getString(R.styleable.EmptyView_empty_title)
        // get the empty subtitle
        emptySubtitle = attributes.getString(R.styleable.EmptyView_empty_subtitle)

        // set the empty image
        emptyImageView.setImageResource(emptyImage)

        // set the provided title to the empty view
        emptyTitleView.text = emptyTitle

        // set the provided subtitle to the empty view
        emptySubtitleView.text = emptySubtitle

        // recycle the attributes in order to manager memory efficiently
        attributes.recycle()
    }

    fun setEmptyViewImage(emptyImage: Int) {
        this.emptyImage = emptyImage
        emptyImageView.setImageResource(emptyImage)
    }

    fun setEmptyViewTitle(emptyTitle: String) {
        this.emptyTitle = emptyTitle
        emptyTitleView.text = emptyTitle
    }

    fun setEmptyViewSubtitle(emptySubtitle: String) {
        this.emptyTitle = emptySubtitle
        emptySubtitleView.text = emptySubtitle
    }
}