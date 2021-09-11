import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.homework193.BlankFragment
import com.example.homework193.R

class MyFragment(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int = 4

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                BlankFragment.newInstance(
                    R.drawable.img1,
                    "Geoaxborot",
                    "Geoaxborot moduli orqali siz o'zingizga yaqin bo'lgan migrantlar va boshqa muassasalar haqida ma'lumot olishingiz mumkin"
                )
            }
            1 -> {
                BlankFragment.newInstance(
                    R.drawable.img2,
                    "Huquqiy axborot",
                    "Huquqiy axborot moduli orqali siz migratsiya sohasiga oid yangiliklardan, qonunlardan xabardor bo'lishingiz va online konsultatsiya olishingiz mumkin"
                )
            }
            2 -> {
                BlankFragment.newInstance(
                    R.drawable.img3,
                    "To'lov xizmatlari",
                    "To'lov xizmatlari moduli orqali siz masofadan turib turli xil xizmatlarga to'lovlar haqida ma'lumot olishingiz va to'lovlarni amalga oshirishingiz mumkin"
                )
            }
            else -> {
                BlankFragment.newInstance(
                    R.drawable.img4,
                    "Qo'shimcha imkoniyat",
                    "Qo'shimcha imkoniyatlar moduli orqali siz interaktiv so'zlashgichlar va lug'atlar yordamida til bilish savodxonligingizni oshirishingiz mumkin"
                )
            }
        }
    }
}