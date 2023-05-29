package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animeList = listOf<NovelClass>(
            NovelClass(
                R.drawable.foto1,
                sepatuname = "Nike Air Force 1",
                sepatudate = "Tanggal Penjualan: \n26 Juni 2020",
                sepatuauthor = "Brand: \nNIKE",
                sepaturate = "Rating: (4,5)",
                ratingbar = 4.5,
                sepatudesc = "Deskripsi: \nSeri satu ini bisa dikatakan sebagai sepatu Nike terlaris dan terpopuler yang wajib dimiliki oleh pencinta sneakers. Siluet basic-nya yang berwarna netral hitam atau putih amat mudah di-mix n match dengan beragam outfit kesayangan Anda. Oleh karena itu, banyak konsumen yang menyukai sepatu Air Force 1. Hal tersebut membuat Nike kerap merilis ulang koleksi sepatu yang sudah ada sejak 1982 ini.\n" +
                        "Sepatu ini awalnya ditujukan untuk olahraga basket sehingga dilengkapi penyerap guncangan serta sol Air Technology yang elastis. Selain itu, terdapat pivot point dan ankle strap pada bagian belakang sol yang merupakan ciri khas sepatu basket. Berkat popularitasnya, selain bisa dipakai untuk olahraga basket, sepatu ini juga bisa untuk kegiatan sehari-hari."
            ),
            NovelClass(
                R.drawable.foto2,
                sepatuname = "Nike Air Jordan 1 Retro High",
                sepatudate = "Tanggal Penjualan: \n23 Juni 2020",
                sepatuauthor = "Brand: \nNIKE",
                sepaturate = "Rating: (4,4)",
                ratingbar = 4.5,
                sepatudesc = "Deskripsi: \nAir Jordan merupakan seri yang lahir dari kolaborasi Nike dengan pemain NBA (National Basketball Association), Michael Jordan. Karena itu, sepatu ini memang dirancang khusus untuk bermain basket. Berkat model high cut-nya yang amat ikonis, banyak konsumen memburu sepatu ini, terutama warna monokrom hitam dan putih.\n" +
                        "Tidak hanya warna monokrom, Anda juga dapat mempertimbangkan sneakers Nike Air Jordan 1 dengan warna merah yang bersejarah. Pasalnya, pada tahun 1980-an sepatu berwarna melanggar regulasi NBA. Meski begitu, Michael Jordan tetap menggunakan sepatu tersebut. Sebagai konsekuensinya, beliau harus membayar denda setiap kali memakainya saat bermain."
            ),
            NovelClass(
                R.drawable.foto3,
                sepatuname = "Nike Air Max 97",
                sepatudate = "Tanggal Penjualan: \n08 Juli 2022",
                sepatuauthor = "Brand: \nNIKE",
                sepaturate = "Rating: (4,6)",
                ratingbar = 4.5,
                sepatudesc = "Deskripsi: \nAir Max 97 merupakan produk Nike yang populer di kalangan muda-mudi dari seluruh penjuru dunia, termasuk Indonesia. Desainnya yang keren membuatnya mudah untuk dipadukan berbagai gaya kasual Anda. Jadi, tidak heran jika seri ini kerap dirilis ulang dan tetap menjadi primadona hingga saat ini.\n" +
                        "Sepatu ini dibekali bantalan berkualitas tinggi dengan daya serap udara dan guncangan yang optimal sehingga makin nyaman ketika dipakai. Air Max 97 bisa disebut sebagai produk utama Nike karena tiap tahunnya selalu ada seri baru yang dirilis. Untuk itu, Anda dapat dengan mudah menemukan berbagai siluet dengan desain warna baru pada seri ini."
            ),
            NovelClass(
                R.drawable.foto4,
                sepatuname = "Nike Free Run 2",
                sepatudate = "Tanggal Penjualan: \n08 Mei 2022",
                sepatuauthor = "Brand: \nNIKE",
                sepaturate = "Rating: (4,5)",
                ratingbar = 4.5,
                sepatudesc = "Deskripsi: \nSeri ini amat populer di kalangan penggiat running dan skateboarding karena desain bantalannya membuat kaki serasa menyentuh tanah langsung. Dengan begitu, pemakainya dapat melatih otot kaki yang biasanya sulit untuk dilatih.\n" +
                        "\n" +
                        "Seri Free juga menggunakan upper material yang secara khusus dikembangkan oleh Nike. Material ini dapat mengikuti kontur kaki sehingga membuatnya fit ketika dipakai layaknya memakai kaus kaki. Untuk Anda yang ingin melatih otot kaki, kami rekomendasikan seri ini."
            ),
            NovelClass(
                R.drawable.foto5,
                sepatuname = "Nike Waffle One Leather",
                sepatudate = "Tanggal Penjualan: \n08 Jan 2022",
                sepatuauthor = "Brand: \nNIKE",
                sepaturate = "Rating: (4,5)",
                ratingbar = 4.5,
                sepatudesc = "Deskripsi: \nSiluet Nike Waffle terbaru merupakan evolusi dari Nike DBreak, mengingat sepatu ini dilengkapi outsole waffle yang legendaris. Sol berbentuk waffle ini dirancang oleh Bill Bowerman yang terinspirasi saat melihat motif alat pembuat waffle. Keunggulannya adalah memaksimalkan cengkeraman di tanah yang dipijak supaya langkah makin terasa mantap.\n" +
                        "\n" +
                        "Siluet retro seri Waffle membuat Anda makin terkesan fashionable ketika memakainya. Untuk Anda yang senang bergaya retro, kami rekomendasikan seri Waffle, seperti Nike Waffle Debut dan Waffle One SE. Anda pun makin stylish saat memadukan outfit retro dengan Nike Waffle"
            ),


        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = NovelAdapter(this, animeList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}