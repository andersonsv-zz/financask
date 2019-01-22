package br.com.alura.financask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.alura.financask.R


class ListaTransacoesAdapter(context: Context, transacoes: List<String>) : BaseAdapter(){

    private val mTransacoes = transacoes
    private val mContext = context

    override fun getView(posicao: Int, view: View?, parent: ViewGroup?): View {
        return LayoutInflater.from(mContext).inflate(R.layout.transacao_item, parent, false)
    }

    override fun getItem(posicao: Int): String {
        return mTransacoes[posicao]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return mTransacoes.size
    }


}