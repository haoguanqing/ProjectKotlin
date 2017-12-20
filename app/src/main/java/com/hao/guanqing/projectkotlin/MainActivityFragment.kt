package com.hao.guanqing.projectkotlin

import android.content.Context
import android.support.v4.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.e("HGQ", "fragment - onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("HGQ", "fragment - onCreate")
        (this::setRetainInstance)(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.e("HGQ", "fragment - onCreateView")
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("HGQ", "fragment - onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("HGQ", "fragment - onActivityCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.e("HGQ", "fragment - onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.e("HGQ", "fragment - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("HGQ", "fragment - onResume")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.e("HGQ", "fragment - onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("HGQ", "fragment - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("HGQ", "fragment - onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("HGQ", "fragment - onDetach")
    }
}
