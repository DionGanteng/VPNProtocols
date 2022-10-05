package com.tim.vpnprotocols.compose.viewmodel

import androidx.compose.runtime.Composable

import com.tim.shadowsocksr.ShadowsocksRVpnConfig
import com.tim.vpnprotocols.compose.edit.ConfigEditViewModel
import com.tim.vpnprotocols.compose.navigation.VpnProtocol
import org.koin.core.qualifier.named
import org.koin.androidx.compose.getViewModel

/**
 * @Author: Тимур Ходжатов
 */
@Composable
fun VpnProtocol.getViewModel() = when (this) {
    VpnProtocol.SHADOWSOCKSR -> getViewModel<ConfigEditViewModel<ShadowsocksRVpnConfig>>(
        named(ShadowsocksRVpnConfig::class.java.name)
    )
}
