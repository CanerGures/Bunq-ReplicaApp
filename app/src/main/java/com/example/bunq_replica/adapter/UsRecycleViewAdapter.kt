package com.example.bunq_replica.adapter

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.bunq_replica.R
import com.example.bunq_replica.model.UsNewsModel

class UsRecycleViewAdapter(private val features: List<UsNewsModel>) :
    RecyclerView.Adapter<UsRecycleViewAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageUrl: ImageView = itemView.findViewById(R.id.usRwItem)
        val txtRw: TextView = itemView.findViewById(R.id.txtRw)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val parentLayout: CardView = itemView.findViewById(R.id.itemCard)
        val tvType: TextView = itemView.findViewById(R.id.tvType)
        val vTvShare: TextView = itemView.findViewById(R.id.vTvShare)
        val vTvClaps: TextView = itemView.findViewById(R.id.vTvClaps)

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        var iconThumbBlue: Drawable? =
            itemView.context.getDrawable(R.drawable.ic_baseline_thumb_up_alt_24)

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        var iconThumbOrange: Drawable? = itemView.context.getDrawable(R.drawable.ic_thumb_orange)

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        var iconThumbRed: Drawable? = itemView.context.getDrawable(R.drawable.ic_thumb_red)

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        var iconShareBlue: Drawable? = itemView.context.getDrawable(R.drawable.ic_share)

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        var iconShareOrange: Drawable? = itemView.context.getDrawable(R.drawable.ic_share_orange)

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        var iconShareRed: Drawable? = itemView.context.getDrawable(R.drawable.ic_share_red)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.us_recycview_item, parent, false)
        return ViewHolder(itemView)
    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = features[position]
        holder.parentLayout.setCardBackgroundColor(Color.parseColor(currentItem.newsBackgroundColor))
        holder.txtRw.text = currentItem.newsText
        holder.tvTitle.text = currentItem.newsTitle
        holder.tvType.text = currentItem.newsType
        holder.tvType.setTextColor(Color.parseColor(currentItem.newsColor))
        holder.vTvClaps.text = currentItem.newsClaps
        holder.vTvClaps.setTextColor(Color.parseColor(currentItem.newsColor))
        holder.vTvShare.setTextColor(Color.parseColor(currentItem.newsColor))


        Glide.with(holder.itemView.context)
            .load(currentItem.newsUrl)
            .fitCenter()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(holder.imageUrl)

    }

    override fun getItemCount(): Int {
        return features.size
    }

}