package com.lolchess.strategy.view.adapter


import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.model.RecommandMeta
import com.lolchess.strategy.view.viewholder.RecommendMetaViewHolder

class RecommendMetaAdapter(private var items : MutableList<RecommandMeta>, var context:Context)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View?

        view = LayoutInflater.from(parent.context).inflate(R.layout.recommend_meta_item, parent, false)
        return RecommendMetaViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        (holder as RecommendMetaViewHolder)
        val paramChamp = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,100,1f)
        val paramSyn = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,1f)

        for(champ in item.champ){
            val imageChamp = ImageView(context)

            imageChamp.setImageResource(champ.imgPath)
            imageChamp.layoutParams = paramChamp

            holder.lytChamp.addView(imageChamp)
        }

        for(syn in item.synergy){
            val imageSyn = ImageView(context)
            imageSyn.setImageResource(syn.imgPath)
            imageSyn.layoutParams = paramSyn
            holder.lytSyn.addView(imageSyn)
        }

        holder.name.text = item.name

    }

}