package com.henken.multitypeviewrecyclerview.data

import com.henken.multitypeviewrecyclerview.R

class Menu {
    companion object {
        val menus: List<Any>
            get() = mutableListOf(
                "Neko",
                MenuItem("Whiskas 1", "Neko", 20000, 0, R.drawable.ic_baseline_fastfood_24),
                MenuItem("Whiskas 2", "Neko", 20000, 0, R.drawable.ic_baseline_fastfood_24),
                MenuItem("Whiskas 3", "Neko", 20000, 0, R.drawable.ic_baseline_fastfood_24),

                "Inu",
                MenuItem("Whiskas Inu 1", "Inu", 20000, 0, R.drawable.ic_baseline_fastfood_24),
                MenuItem("Whiskas Inu 2", "Inu", 20000, 0, R.drawable.ic_baseline_fastfood_24),
                MenuItem("Whiskas Inu 3", "Inu", 20000, 0, R.drawable.ic_baseline_fastfood_24),
            )
    }
}