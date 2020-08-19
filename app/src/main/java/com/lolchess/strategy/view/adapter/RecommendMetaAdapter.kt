package com.lolchess.strategy.view.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import com.lolchess.strategy.R
import com.lolchess.strategy.model.RecommandMeta
import kotlinx.android.synthetic.main.recommend_meta_item.view.*

class RecommendMetaAdapter(private var items : MutableList<RecommandMeta>, var context:Context)
    : BaseAdapter(){
    /*override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View?

        view = LayoutInflater.from(parent.context).inflate(R.layout.recommend_meta_item, parent, false)
        return RecommendMetaViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        (holder as RecommendMetaViewHolder)
        val paramChamp = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,100,1f)
        val paramSyn = LinearLayout.LayoutParams(70,70,1f)


        for(champ in item.champ){
            val imageChamp = ImageView(context)

            imageChamp.setImageResource(champ.imgPath)
            imageChamp.layoutParams = paramChamp
            imageChamp.setOnClickListener {
                holder.initialize(champ)
            }
            holder.lytChamp.addView(imageChamp)
        }


        for(syn in item.synergy){
            val imageSyn = ImageView(context)
            imageSyn.setImageResource(syn.imgPath)
            imageSyn.layoutParams = paramSyn
            holder.lytSyn.addView(imageSyn)
        }




        holder.name.text = item.name

    }*/

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View?
        view = LayoutInflater.from(parent!!.context).inflate(R.layout.recommend_meta_item, parent, false)
        val viewHolder = ViewHolder(view)
        val item = items[position]
        val paramChamp = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,100,1f)
        val paramSyn = LinearLayout.LayoutParams(70,70,1f)
        val paramItem = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,30, 1f)

        for(champ in item.champ){
            val imageChamp = ImageView(context)

            imageChamp.setImageResource(champ.imgPath)
            imageChamp.layoutParams = paramChamp
            viewHolder.lytChamp.addView(imageChamp)
        }


        for(syn in item.synergy){
            val imageSyn = ImageView(context)
            imageSyn.setImageResource(syn.imgPath)
            imageSyn.layoutParams = paramSyn
            viewHolder.lytSyn.addView(imageSyn)
        }

        for(items in item.item){
            val imageItem = ImageView(context)

            imageItem.setImageResource(items.imgPath)
            imageItem.layoutParams = paramItem
            viewHolder.lytItem.addView(imageItem)
        }
        viewHolder.name.text = item.name

        return view
    }

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = 0

    override fun getCount(): Int = items.size

    inner class ViewHolder(view: View){
        var name = view.txtMetaName
        var lytChamp = view.lytChamp
        var lytSyn = view.lytSyn
        var lytItem = view.lytItem
    }
}