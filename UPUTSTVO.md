# HTML → Android aplikacija

Vaši fajlovi (HTML, CSS, JS, slike) idu u folder **`html/`**.
Glavni fajl mora da se zove **`index.html`**.

---

## ☁️ Varijanta 1: ONLAJN preko GitHub-a (bez instalacije, radi i sa telefona)

1. Napravite besplatan nalog na **github.com**.
2. Gore desno **+ > New repository** → upišite ime (npr. `moja-aplikacija`) → **Create repository**.
3. Kliknite **uploading an existing file** i prevucite **sav sadržaj** raspakovanog
   foldera `html2apk` (uključujući skriveni folder `.github`!) → **Commit changes**.
   - Na telefonu je lakše: otpremite ZIP preko računara jednom, a kasnije menjate
     samo fajlove u `html/` (otvorite folder `html` → **Add file > Upload files**).
   - Ako se folder `.github` ne vidi: **Add file > Create new file**, upišite ime
     `.github/workflows/build-apk.yml` i nalepite sadržaj tog fajla.
4. Otvorite karticu **Actions** – build kreće sam (traje ~3–5 minuta).
   Ako piše da su Actions isključene, kliknite zeleno dugme da ih uključite.
5. Kad je gotovo (zelena kvačica), otvorite stranicu repozitorijuma →
   desno **Releases** → najnovija verzija → **aplikacija.apk**.
   Otvorite taj link na telefonu, preuzmite i instalirajte
   (dozvolite „instalaciju iz nepoznatih izvora“ kad telefon pita).

Svaki put kad promenite neki fajl u `html/`, automatski se pravi nova verzija.

---

## 💻 Varijanta 2: Android Studio na računaru

1. **File > Open** → folder `html2apk`, sačekajte „Gradle sync“.
2. Ubacite svoje fajlove u `html/`.
3. **Build > Build App Bundle(s) / APK(s) > Build APK(s)**.
   APK: `app/build/outputs/apk/debug/app-debug.apk`.

---

## Podešavanja
- **Ime aplikacije:** `app/src/main/res/values/strings.xml` → `app_name`
- **ID aplikacije:** `app/build.gradle.kts` → `applicationId`
  (npr. `com.vaseime.mojaapp`; mora biti različit za svaku vašu aplikaciju)
- **Ikonica:** zamenite `app/src/main/res/drawable/ic_launcher.xml`,
  ili u Android Studiju desni klik na `res` → **New > Image Asset**.
- **Sajt umesto lokalnih fajlova:** u `MainActivity.java` promenite
  `START_URL` (npr. `https://mojsajt.rs`) i `LOCAL_HOST` (`mojsajt.rs`).

## Šta aplikacija podržava
JavaScript, localStorage, `fetch()` lokalnih fajlova, dugme „Nazad“,
spoljni linkovi u pregledaču, `tel:`/`mailto:` linkovi, rotacija ekrana.

## Napomena
Ovako napravljen APK je za instaliranje na telefon i deljenje.
Za Google Play treba potpisan AAB (Android Studio: **Build > Generate Signed App Bundle**).
