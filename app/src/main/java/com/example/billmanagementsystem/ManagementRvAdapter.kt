package com.example.billmanagementsystem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.billmanagementsystem.databinding.ManagementListItemBinding

class ManagementRvAdapter() {
    class TweetRvAdapter(var ManagementList:List<ManagementData>) : RecyclerView.Adapter<ContactViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
            val binding =
                ManagementListItemBinding.inflate(LayoutInflater.from(parent.context),parent ,false)
            return ContactViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
            var currentContact =ManagementList.get(position)
            var  binding=holder.binding
            binding.tilFirstName.text=currentContact.FirstName.
            binding.tilFirstName.text=currentContact.FirstName.

            binding.tilPhoneNumber.text=currentContact.PhoneNumber.toString()
            binding.tilEmail.text =currentContact.Email
        }
        override fun getItemCount(): Int {
            return ManagementList.size
        }
    }
    class ContactViewHolder( var binding:ManagementListItemBinding): RecyclerView.ViewHolder(binding.root)

}