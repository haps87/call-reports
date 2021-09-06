package `in`.callreports.adapters

import `in`.callreports.fragments.FragmentBlocked
import `in`.callreports.fragments.FragmentCallLogs
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MainPagerAdapter(fm: FragmentManager, behavior: Int) : FragmentStatePagerAdapter(fm, behavior) {

    private val NUM_COUNT : Int = 2

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return FragmentCallLogs()
            }
            1 -> {
                return FragmentBlocked()
            }
            else -> {
                return FragmentCallLogs()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {

        when(position) {
            0 -> return "Call Logs"
            1 -> return "Blocked"
        }
        return super.getPageTitle(position)
    }

    override fun getCount(): Int {
        return NUM_COUNT
    }

}