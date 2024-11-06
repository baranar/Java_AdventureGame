# Macera Adası (OOP Uygulaması)

Bu proje, Nesne Yönelimli Programlama (OOP) konseptlerini pratik etmek amacıyla tasarlanmış bir metin tabanlı macera oyunudur. Oyuncular, macera dolu bir adada mahsur kalır ve hayatta kalmak için karakterlerini stratejik olarak yönetmelidir.

---

## 🏹 Oyunun Konusu

Kullanıcı, oyun başlarken bir karakter seçecek. Her karakterin kendine özgü özellikleri ve başlangıç değerleri bulunmaktadır. Oyuncular, adada hayatta kalmak ve üç temel eşyayı (Yemek, Odun, Su) toplamak zorundadır. Bu eşyaları toplayarak güvenli eve dönmek, oyunun tamamlanması için gereklidir.

---

## 🧙‍♂️ Karakterler

| **Karakter** | **ID** | **Hasar** | **Sağlık** | **Para** |
|--------------|--------|-----------|------------|----------|
| Samuray      | 1      | 5         | 21         | 15       |
| Okçu         | 2      | 7         | 18         | 20       |
| Şövalye      | 3      | 8         | 24         | 5        |

---

## 🏠 Mekanlar

| **Mekan**    | **Canavar**       | **Özellik**                   | **Eşya**              |
|--------------|--------------------|-------------------------------|----------------------|
| **Güvenli Ev** | -                  | Can Yenileniyor               | -                    |
| **Mağara**     | Zombi (1-3 Adet)   | Savaş + Ganimet              | Yemek (Food)         |
| **Orman**      | Vampir (1-3 Adet)  | Savaş + Ganimet              | Odun (Firewood)      |
| **Nehir**      | Ayı (1-3 Adet)     | Savaş + Ganimet              | Su (Water)           |
| **Mağaza**     | -                  | Destekleyici Eşyalar Satın Almak | Silah: Tabanca, Kılıç, Tüfek <br> Zırh: Hafif, Orta, Ağır |

### Mekan Kuralları
- Her mekanda karşılaşacağınız canavar sayısı rastgele 1-3 arasında belirlenir.
- Mekanı temizleyip ödül eşyasını aldıktan sonra, para kazanmak için tekrar aynı mekana girebilirsiniz. Ancak ödül eşyası yalnızca bir kere alınabilir.

---

## 🏹 Mağaza Eşyaları

### Silahlar

| **Silah**  | **ID** | **Hasar** | **Para** |
|------------|--------|-----------|----------|
| Tabanca    | 1      | 2         | 25       |
| Kılıç      | 2      | 3         | 35       |
| Tüfek      | 3      | 7         | 45       |

### Zırhlar

| **Zırh**   | **ID** | **Engelleme** | **Para** |
|------------|--------|---------------|----------|
| Hafif      | 1      | 1             | 15       |
| Orta       | 2      | 3             | 25       |
| Ağır       | 3      | 5             | 40       |

### Mağaza Kuralları
- Para, mağazadan destekleyici eşyalar almak için kullanılır.
- Aynı anda yalnızca bir silah ve bir zırh taşıyabilirsiniz.
- **Silahlar**: Hasar gücünüzü arttırır.
- **Zırhlar**: Alınan hasarı blok değeri kadar düşürür.

---

## 🧟‍♂️ Canavarlar

| **Canavar** | **ID** | **Hasar** | **Sağlık** | **Para** |
|-------------|--------|-----------|------------|----------|
| Zombi       | 1      | 3         | 10         | 4        |
| Vampir      | 2      | 4         | 14         | 7        |
| Ayı         | 3      | 7         | 20         | 12       |

---

## ⚔️ Savaş Sistemi

- **Seçenekler**: Mekana girdiğinde "Savaşmak" veya "Kaçmak" arasında seçim yapman gerekecek.
- **Savaş Sırası**: Vurma işlemi sırayla yapılır. Oyuncu önce saldırır, ardından canavar karşı saldırıda bulunur. Bu sıra savaş sona erene kadar devam eder.

---

Oyunun keyfini çıkarın ve hayatta kalmaya çalışın!
