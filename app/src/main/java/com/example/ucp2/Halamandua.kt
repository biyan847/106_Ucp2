package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.ucp2.data.infordataclass
import com.example.ucp2.data.infordataclass as infordataclass1

@Composable
fun Halamandua(
    infordataclass: infordataclass,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.Padding_medium)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.Padding_small))
        ){
            Column(
                modifier = Modifier
                    .padding(10.dp),

                ){
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Text(stringResource(id = R.string.Nama))
                    Text(text = infordataclass.nama)

                }
                Divider()
                Spacer(modifier = Modifier.padding(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Text(stringResource(id = R.string.nim))
                    Text(text = infordataclass.nim)
                }
                Divider()
                Spacer(modifier = Modifier.padding(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Text(stringResource(id = R.string.konsentrasi))
                    Text(text = infordataclass.konsentrasi)
                }
                Divider()
                Spacer(modifier = Modifier.padding(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Text(stringResource(id = R.string.judul))
                    Text(text = infordataclass.judul)
                }
                Row(
                    modifier = Modifier
                        .weight(1f, false)
                        .padding(dimensionResource(R.dimen.Padding_small))
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.Padding_medium))
                    ) {
                        OutlinedButton(
                            modifier = Modifier.fillMaxWidth(),
                            onClick = onCancelButtonClicked
                        ) {
                            Text(stringResource(R.string.back))
                        }
                    }
                }
            }
        }
    }
}
