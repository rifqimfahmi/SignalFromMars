package net.renotekno.rifqi.signalfrommars.model;

import net.renotekno.rifqi.signalfrommars.R;

public class Story {
    private Page[] mPages;

    public Story(){
        mPages = new Page[7];

        mPages[0] = new Page(
                R.drawable.page0,
                "Dalam perjalanan pulang mempelajari cincin Saturnus, Kamu mendengar sinyal yang sepertinya datang dari permukaan mars. Ini aneh karena sebelumnya belum pernah ada penduduk disana. Ada orang asing yang teriak memanggil nama mu: \"Tolong aku, %1$s, Kamu adalah harapan aku satu-satunya.\"",
                new Choice("Stop and investigate", 1),
                new Choice("Continue home to Earth", 2));

        mPages[1] = new Page(
                R.drawable.page1,
                "Kamu dengan cepat mendarat dekat dengan suara itu berasal. Kamu tidak melihat sesuatu yang aneh saat kamu terbang, Tetapi ada sebuah goa di depan kamu. Dibelakang mu terdapat kendaraan yang ditinggalkan dari abad 21.",
                new Choice("Explore the cave", 3),
                new Choice("Explore the rover", 4));

        mPages[2] = new Page(
                R.drawable.page2,
                "Kamu melanjutkan perjalanan ke bumi. Dua hari berikutnya, Kamu menerima pesan dari markas yang mengatakan bahwa mereka telah mendeteksi keanehan pada permukaan mars dekat dengan kendaraan yang ditinggalkan. Mereka menyuruhmu untuk menginvestigasi, kamu dapat memilih karena misi mu sudah melebihi batas waktu yang direncanakan dan persediaan tinggal sedikit.",
                new Choice("Head back to Mars to investigate", 4),
                new Choice("Continue home to Earth", 6));

        mPages[3] = new Page(
                R.drawable.page3,
                "Pakaian EVA mu telah terpasang Headlamp, yang membantu kamu untuk menjelajahi goa tersebut. Setelah mencari beberapa lama kadar oxygen mu menurun. Kamu tahu kamu harus mengisi tabung oxygen itu, tetapi terdapat cahaya samar - samar di depan.",
                new Choice("Refill at ship and explore the rover", 4),
                new Choice("Continue towards the faint light", 5));

        mPages[4] = new Page(
                R.drawable.page4,
                "Kendaraan tersebut tertutup dengan debu dan banyak panel surya yang telah rusak. Tetapi kamu sedikit terkejut melihat on-board sistem menyala. Kemudian terdapat pesan pada layar: \"%1$s, datang ke 28.543436, -81.369031.\" Koordinat tersebut tidak jauh, tetapi kamu tidak tahu apakah oxygen mu cukup.",
                new Choice("Explore the coordinates", 5),
                new Choice("Return to Earth", 6));

        mPages[5] = new Page(
                R.drawable.page5,
                "Setelah berjalan sedikit menanjak, kamu berhenti di atas kawah kecil. Kamu melihat sekitar, dan kamu gembira sekali melihat android favorite mu, %1$s-S1124 yang sebelumnya hilang pada misi di Mars! Kamu mengambilnya dan kamu kembali ke pesawat dan terbang pulang ke bumi.");

        mPages[6] = new Page(
                R.drawable.page6,
                "Kamu tiba di bumi dan sampai di rumah. meskipun misi mu sukses, Kamu selalu penasaran tentang sinyal tersebut. Mungkin pada misi berikutnya kamu akan mengetahuinya...");
    }

    public Page getPage(int page){
        return mPages[page];
    }



}


