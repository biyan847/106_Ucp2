package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun hHalamansatu(
    onSubmitClicked : (MutableList<String>)->Unit,
    onCancelButtonClicked: () -> Unit,
) {
    var nama by remember {
        mutableStateOf("")
    }
    var nim by remember {
        mutableStateOf("")
    }
    var konsentrasi by remember {
        mutableStateOf("")
    }
    var judul by remember {
        mutableStateOf("")
    }
    var listData: MutableList<String> = mutableListOf(nama, nim, konsentrasi, judul)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = nama,
            onValueChange = { nama = it },
            label = { Text(stringResource(id = R.string.Nama)) }
        )
        OutlinedTextField(
            value = nim,
            onValueChange = { nim = it },
            label = { Text(stringResource(id = R.string.nim)) }
        )
        OutlinedTextField(
            value = konsentrasi,
            onValueChange = { konsentrasi = it },
            label = { Text(stringResource(id = R.string.konsentrasi)) }
        )
        OutlinedTextField(
            value = judul,
            onValueChange = { judul = it },
            label = { Text(stringResource(id = R.string.judul)) }
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(onClick = { onSubmitClicked(listData) }, enabled = nama.isNotEmpty()) {
                Text(stringResource(id = R.string.submit))
            }
        }
    }
}