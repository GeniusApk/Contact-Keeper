package com.geniusapk.contactkeeper.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.geniusapk.contactkeeper.data.database.Contact


data class ContactState(
    val contacts: List<Contact> = emptyList(),
    val id : MutableState<Int> = mutableStateOf(1),
    val name : MutableState<String> = mutableStateOf(""),
    val phone : MutableState<String> = mutableStateOf(""),
    val email : MutableState<String> = mutableStateOf(""),
    //val isActive : MutableState<Boolean> = mutableStateOf(true),
    val dateOfCreation : MutableState<Long> = mutableStateOf(0),
    val image : MutableState<ByteArray?> = mutableStateOf(null),




    )
