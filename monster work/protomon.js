
window.addEventListener('DOMContentLoaded', (event) =>{

    let statMinimum = 60

    let keysPressed = {}

    document.addEventListener('keydown', (event) => {
        keysPressed[event.key] = true;
     });
     
     document.addEventListener('keyup', (event) => {
         delete keysPressed[event.key];
      });



   let FrrtTwo = 1.17
   let CbrtTwo = 1.22
   let SqrtTwo = 1.42

    
   let kunkid = 1;
   let kunkat = 75;
   let kunksp = 60;
   let kunkde = 120;
   let kunkhe = 185;
   // MediaPlayer KunkSong;

   let kohbohid = 2;
   let kohbohat = 101; //100
   let kohbohsp = 101; //100
   let kohbohde = 101; //100
   let kohbohhe = 101; //100
   // MediaPlayer KohbohSong;

   let djoperid = 3;
   let djoperat = 274;
   let djopersp = 65;
   let djoperde = 70;
   let djoperhe = 80;

   let schorpid = 4;
   let schorpat = 65; // 60
   let schorpsp = 105;
   let schorpde = 100;
   let schorphe = 158;

   let zaumeid = 5;
   let zaumeat = 94; // 94
   let zaumesp = 180;
   let zaumede = 77;
   let zaumehe = 77;

   let nhainhaiid = 6;
   let nhainhaiat = 51;
   let nhainhaisp = 52; // 52
   let nhainhaide = 51; // 51
   let nhainhaihe = 462;

   let degeissdtid = 7;
   let degeissdtat = 361;
   let degeissdtsp = 61;
   let degeissdtde = 60;
   let degeissdthe = 76;

   let yuggleid = 8;
   let yuggleat = 160; //155
   let yugglesp = 179;
   let yugglede = 60;
   let yugglehe = 66;

   let bonguid = 9;
   let bonguat = 60;
   let bongusp = 64;
   let bongude = 319;
   let bonguhe = 83; /// 60

 //  let bonguid = 9;
//   let bonguat = 60;
 //  let bongusp = 65;
 //  let bongude = 422;
//   let bonguhe = 61;

   let giterigliaid = 10;
   let giterigliaat = 111;
   let giterigliasp = 95;
   let giterigliade = 106; //101
   let giterigliahe = 94;

   let cyosterothid = 11;
   let cyosterothat = 73; // 70
   let cyosterothsp = 125;
   let cyosterothde = 88; // 81 // 87
   let cyosterothhe = 141;

   let nentopodeid = 12;
   let nentopodeat = 70; // 76
   let nentopodesp = 63;
   let nentopodede = 160;
   let nentopodehe = 130;

   let centiclakid = 13;
   let centiclakat = 104; // 90
   let centiclaksp = 111;
   let centiclakde = 74;
   let centiclakhe = 135;

   let uggnawbid = 14;
   let uggnawbat = 65;
   let uggnawbsp = 159; // Real Uggnawb
   let uggnawbde = 60;
   let uggnawbhe = 160;

    /*  let uggnawbid = 14;
   let uggnawbat = 51;
   let uggnawbsp = 214; // boosted Uggnawb
   let uggnawbde = 51;
   let uggnawbhe = 200;*/

   let grobhostid = 15;
   let grobhostat = 142;
   let grobhostsp = 66;
   let grobhostde = 80;
   let grobhosthe = 134;

   let illelonabid = 16;
   let illelonabat = 154;
   let illelonabsp = 68;
   let illelonabde = 73;
   let illelonabhe = 131;

   let rongzeedid = 17;
   let rongzeedat = 95;
   let rongzeedsp = 63;
   let rongzeedde = 67; // 75
   let rongzeedhe = 220;

   let blattleid = 18;
   let blattleat = 149;
   let blattlesp = 67;
   let blattlede = 109;
   let blattlehe = 92;

   let swogharnlerid = 19;
   let swogharnlerat = 119; // 113
   let swogharnlersp = 69;
   let swogharnlerde = 119; // 113
   let swogharnlerhe = 119; // 113

   let adenolishid = 20;
   let adenolishat = 123;
   let adenolishsp = 69;
   let adenolishde = 146;
   let adenolishhe = 81;

   let genaupresangid = 21;
   let genaupresangat = 101;
   let genaupresangsp = 71;
   let genaupresangde = 100;
   let genaupresanghe = 140;

   let daahnidaid = 22;
   let daahnidaat = 60;
   let daahnidasp = 462;
   let daahnidade = 52;
   let daahnidahe = 61;

   let sorbaid = 23;
   let sorbaat = 150; // 150
   let sorbasp = 67;
   let sorbade = 151; // 151
   let sorbahe = 66;

   let jiyouid = 24;
   let jiyouat = 67;
   let jiyousp = 66;
   let jiyoude = 150;  //150 // 140
   let jiyouhe = 151;  //151 // 141

   let sparvaeid = 25;
   let sparvaeat = 162;
   let sparvaesp = 62;
   let sparvaede = 110;
   let sparvaehe = 91;

   let vellupid = 26;
   let vellupat = 69; // 60
   let vellupsp = 110;
   let vellupde = 271;
   let velluphe = 69; // 54

 //  let vellupid = 26;
 //  let vellupat = 60;
 //  let vellupsp = 62;
 //  let vellupde = 371;
 //  let velluphe = 72;

   let bellajaid = 27;
   let bellajaat = 52; // 60
   let bellajasp = 89;
   let bellajade = 52; //55
   let bellajahe = 319;

   let levdzellid = 28;
   let levdzellat = 61;
   let levdzellsp = 113;
   let levdzellde = 214;
   let levdzellhe = 68;

   let ryteggid = 29;
   let ryteggat = 61;
   let ryteggsp = 112;
   let ryteggde = 61;
   let rytegghe = 240;

   let flashmerid = 30;
   let flashmerat = 101; // 100
   let flashmersp = 114;
   let flashmerde = 84;
   let flashmerhe = 105;

   let schmodozerid = 31;
   let schmodozerat = 139;
   let schmodozersp = 72;
   let schmodozerde = 141;
   let schmodozerhe = 71;

   let octgototid = 32;
   let octgototat = 170;
   let octgototsp = 95;
   let octgototde = 66;
   let octgotothe = 94;

   let triauralid = 33;
   let triauralat = 97; // 95
   let triauralsp = 117;
   let triauralde = 97;// 95
   let triauralhe = 97;// 95

   let dicytoid = 34;
   let dicytoat = 86;
   let dicytosp = 116;
   let dicytode = 95;
   let dicytohe = 116; // 106

   let monopteryxid = 35;
   let monopteryxat = 155;
   let monopteryxsp = 115;
   let monopteryxde = 75;
   let monopteryxhe = 75;

   let elastocarkid = 36;
   let elastocarkat = 77;
   let elastocarksp = 90;
   let elastocarkde = 92;
   let elastocarkhe = 157;

   let toobapathid = 37;
   let toobapathat = 94; // was 90 6/13/19
   let toobapathsp = 94;
   let toobapathde = 126;
   let toobapathhe = 94;

   let weeliosbopid = 38;
   let weeliosbopat = 83;
   let weeliosbopsp = 96;
   let weeliosbopde = 112;
   let weeliosbophe = 112;

   let ihmpdrapid = 39;
   let ihmpdrapat = 104;
   let ihmpdrapsp = 99;
   let ihmpdrapde = 68;
   let ihmpdraphe = 141;

   let epibazangid = 40;
   let epibazangat = 134;
   let epibazangsp = 82;
   let epibazangde = 123;
   let epibazanghe = 74;

   let hemtanid = 41;
   let hemtanat = 100;
   let hemtansp = 80;
   let hemtande = 125;
   let hemtanhe = 100;

   let ogoid = 42;
   let ogoat = 165;
   let ogosp = 165;
   let ogode = 61;
   let ogohe = 61;

   let strachidid = 43;
   let strachidat = 58;
   let strachidsp = 167;
   let strachidde = 99;
   let strachidhe = 167;

/*
   let strachidid = 43;
   let strachidat = 62;
   let strachidsp = 167;
   let strachidde = 99;
   let strachidhe = 107;

   let strachidhe = 98;
*/
   let toximasticaid = 44;
   let toximasticaat = 71;
   let toximasticasp = 172;
   let toximasticade = 109;
   let toximasticahe = 119;

   let urcuriaid = 45;
   let urcuriaat = 60;
   let urcuriasp = 176;
   let urcuriade = 104;
   let urcuriahe = 150;

   let hyuntressid = 46;
   let hyuntressat = 77; //75
   let hyuntresssp = 70;
   let hyuntressde = 51; // 61
   let hyuntresshe = 283; // 301

   let mondosplakid = 47;
   let mondosplakat = 115;
   let mondosplaksp = 82;
   let mondosplakde = 60;
   let mondosplakhe = 176;

   let kaheksagugeid = 48;
   let kaheksagugeat = 80;
   let kaheksagugesp = 83;
   let kaheksagugede = 80;
   let kaheksagugehe = 190;

   let sapiosuantid = 49;
   let sapiosuantat = 100;
   let sapiosuantsp = 101;
   let sapiosuantde = 70;
   let sapiosuanthe = 142;

   let munegullid = 50;
   let munegullat = 130;
   let munegullsp = 81;
   let munegullde = 100;
   let munegullhe = 94;

   let sudakleezid = 51;
   let sudakleezat = 72;
   let sudakleezsp = 102;
   let sudakleezde = 70;
   let sudakleezhe = 194;

   let halocordateid = 52;
   let halocordateat = 170;
   let halocordatesp = 120;
   let halocordatede = 70;
   let halocordatehe = 70;

   let fadendronid = 53;
   let fadendronat = 95;
   let fadendronsp = 93;
   let fadendronde = 60;
   let fadendronhe = 187;

   let osteoplangid = 54;
   let osteoplangat = 84;
   let osteoplangsp = 86;
   let osteoplangde = 70;
   let osteoplanghe = 198;

   let zrachnidid = 55;
   let zrachnidat = 211;
   let zrachnidsp = 73;
   let zrachnidde = 80;
   let zrachnidhe = 81;

   let xlitchid = 56;
   let xlitchat = 135; //135
   let xlitchsp = 80; //74
   let xlitchde = 135; //135
   let xlitchhe = 80; //74

   let baaid = 57;
   let baaat = 88;
   let baasp = 75;
   let baade = 150;
   let baahe = 101;

   let mantidileid = 58;
   let mantidileat = 79;
   let mantidilesp = 76;
   let mantidilede = 122;
   let mantidilehe = 137;

   let nokoylid = 59;
   let nokoylat = 82;
   let nokoylsp = 121;
   let nokoylde = 70;
   let nokoylhe = 154; //148

   let yallodid = 60;
   let yallodat = 100;
   let yallodsp = 78;
   let yallodde = 75;
   let yallodhe = 166;

   let algaetizerid = 61;
   let algaetizerat = 98;
   let algaetizersp = 79;
   let algaetizerde = 104;
   let algaetizerhe = 124;

   let kachortid = 62;
   let kachortat = 97; //102
   let kachortsp = 77;
   let kachortde = 67;
   let kachorthe = 184;

   let slamelionid = 63;
   let slamelionat = 99;
   let slamelionsp = 84;
   let slamelionde = 86;
   let slamelionhe = 145;

   let ayatedaid = 64;
   let ayatedaat = 77;
   let ayatedasp = 85;
   let ayatedade = 131;
   let ayatedahe = 118;

   let wochemid = 65;
   let wochemat = 85;
   let wochemsp = 87;
   let wochemde = 100;
   let wochemhe = 135;

   let humunid = 66;
   let humunat = 92;
   let humunsp = 91;
   let humunde = 107;
   let humunhe = 115;

   let ψkobathid = 67;
   let ψkobathat = 94;
   let ψkobathsp = 88;
   let ψkobathde = 110;
   let ψkobathhe = 112;

   let gytanicid = 68;
   let gytanicat = 174;
   let gytanicsp = 97;
   let gytanicde = 60;
   let gytaniche = 100;

   let beisid = 69;
   let beisat = 85;
   let beissp = 119;
   let beisde = 67;
   let beishe = 159;

   let gungholioid = 70;
   let gungholioat = 253;
   let gungholiosp = 92;
   let gungholiode = 56;
   let gungholiohe = 68;

   let honigkonigid = 71;
   let honigkonigat = 89; // 117 // 84
   let honigkonigsp = 71;  // 57  // 97 // 80
   let honigkonigde = 201; // 100 // 200
   let honigkonighe = 74; // 151 // 71

   let kungulpid = 72;
   let kungulpat = 348; // 123 // 160
   let kungulpsp = 77;
   let kungulpde = 61; // 51
   let kungulphe = 61;

    /*

   let σativnellaid = -73;
   let σativnellaat = 289;
   let σativnellasp = 62; // 58
   let σativnellade = 60;
   let σativnellahe = 53; // 150
   let kungulpid = 72;
   let kungulpat = 133; // 123 // 160
   let kungulpsp = 118;
   let kungulpde = 77;
   let kungulphe = 114;
    */

   let σatinellaid = 73;
   let σatinellaat = 84;
   let σatinellasp = 62; // 58
   let σatinellade = 143;
   let σatinellahe = 118; // 150

   let elocurlid = 74;
   let elocurlat = 86;
   let elocurlsp = 112;
   let elocurlde = 99;
   let elocurlhe = 117;

   let takobieid = 75;
   let takobieat = 120; //91
   let takobiesp = 108; //123
   let takobiede = 99; //115
   let takobiehe = 91;  //91

   let obchovyid = 76;
   let obchovyat = 132; //
   let obchovysp = 122; //
   let obchovyde = 60; //
   let obchovyhe = 109;  //

   let nimnamnomid = 77;
   let nimnamnomat = 137; // 133
   let nimnamnomsp = 64; //
   let nimnamnomde = 99; //
   let nimnamnomhe = 119;  // 121

   let tutewtooid = 78;
   let tutewtooat = 119; //
   let tutewtoosp = 119; //
   let tutewtoode = 60; //
   let tutewtoohe = 119;  //

   let blanqastid = 79;
   let blanqastat = 111; //
   let blanqastsp = 74; //
   let blanqastde = 111; //
   let blanqasthe = 111;  //

   let indeoid = 80;
   let indeoat = 126; //
   let indeosp = 126; //
   let indeode = 51; //
   let indeohe = 126;  //

   let deblobbioid = 81;
   let deblobbioat = 119; //
   let deblobbiosp = 109; //
   let deblobbiode = 99; //
   let deblobbiohe = 89;  //

   let knightstaceanid = 82;
   let knightstaceanat = 117; //
   let knightstaceansp = 107; //
   let knightstaceande = 117; //
   let knightstaceanhe = 78;  //

   let prostraxid = 83;
   let prostraxat = 325; //
   let prostraxsp = 52; //
   let prostraxde = 71; //
   let prostraxhe = 71;  //

   let haptozahenid = 84;
   let haptozahenat = 52; //
   let haptozahensp = 325; //
   let haptozahende = 109; //
   let haptozahenhe = 109;  //

   let minkohabodid = 85;
   let minkohabodat = 68; //
   let minkohabodsp = 68; //
   let minkohabodde = 325; //
   let minkohabodhe = 68;  //

   let zeenid = 86;
   let zeenat = 72; // 72
   let zeensp = 121; // 71
   let zeende = 112; // 112
   let zeenhe = 112;  // 112

   let tacroachid = 87;
   let tacroachat = 126; // 72
   let tacroachsp = 124; // 71
   let tacroachde = 126; // 112
   let tacroachhe = 55;  // 112

   let manterflyid = 88;
   let manterflyat = 172; // 72
   let manterflysp = 110; // 71
   let manterflyde = 62; // 112
   let manterflyhe = 90;  // 112


   let bearyid = 89;
   let bearyat = 189; // 72 // 166
   let bearysp = 65; // 71  // 60 // 72
   let bearyde = 60; // 112
   let bearyhe = 143;  // 112 // 171

   let sluggernautid = 90;
   let sluggernautat = 150; 
   let sluggernautsp = 53; 
   let sluggernautde = 57; 
   let sluggernauthe = 180;

   let memeekid = 92;
   let memeekat = 100;
   let memeeksp = 102;
   let memeekde = 100;
   let memeekhe = 131;


   let doughgnatid = 93;
   let doughgnatat = 168;
   let doughgnatsp = 153;
   let doughgnatde = 51;
   let doughgnathe = 85;


   let ratticid = 94;
   let ratticat = 154;
   let ratticsp = 55;
   let ratticde = 114;
   let rattiche = 85;


   let missileaneousid = 95;
   let missileaneousat = 189;
   let missileaneoussp = 57;
   let missileaneousde = 65;
   let missileaneoushe = 133;


   let runnybabbitid = 96;
   let runnybabbitat = 60;
   let runnybabbitsp = 120;
   let runnybabbitde = 55;
   let runnybabbithe = 253;


   let zubgondrakterid = 97;
   let zubgondrakterat = 71;
   let zubgondraktersp = 98;
   let zubgondrakterde = 103;
   let zubgondrakterhe = 151;

   let whumpuhmpid = 98;
   let whumpuhmpat = 104;
   let whumpuhmpsp = 104;
   let whumpuhmpde = 104;
   let whumpuhmphe = 90;

   let mangoonid = 99;
   let mangoonat = 194;
   let mangoonsp = 54;
   let mangoonde = 59;
   let mangoonhe = 161;

   let scarbequeid = 100;
   let scarbequeat = 131;
   let scarbequesp = 106;
   let scarbequede = 85;
   let scarbequehe = 85;

   let fwuffynumpkinsid = 101;
   let fwuffynumpkinsat = 60;
   let fwuffynumpkinssp = 58;
   let fwuffynumpkinsde = 82;
   let fwuffynumpkinshe = 350;


   let dothogid = 102;
   let dothogat = 85;
   let dothogsp = 106;
   let dothogde = 131;
   let dothoghe = 85;

   let reefcakeid = 103;
   let reefcakeat = 65;
   let reefcakesp = 70;
   let reefcakede = 65;
   let reefcakehe = 301;


   let cheetzaid = 104;
   let cheetzaat = 90;
   let cheetzasp = 240;
   let cheetzade = 58;
   let cheetzahe = 80;


   let sortsandid = 105;
   let sortsandat = 56;
   let sortsandsp = 79;
   let sortsandde = 240;
   let sortsandhe = 109;



   let chilldebeestid = 106;
   let chilldebeestat = 97;
   let chilldebeestsp = 133;
   let chilldebeestde = 78;
   let chilldebeesthe = 100;


   let communigatorid = 107;
   let communigatorat = 122;
   let communigatorsp = 137;
   let communigatorde = 76;
   let communigatorhe = 79;
    

   let mossbossid = 108;
   let mossbossat = 200;
   let mossbosssp = 68;
   let mossbossde = 82;
   let mossbosshe = 91;

   let vampreyid = 109;
   let vampreyat = 246;
   let vampreysp = 70;
   let vampreyde = 54;
   let vampreyhe = 110;

   let parafoxid = 110;
   let parafoxat = 88;
   let parafoxsp = 140;
   let parafoxde = 64;
   let parafoxhe = 130;
    
   let rhischlosserousid = 111;
   let rhischlosserousat = 88;
   let rhischlosseroussp = 64;
   let rhischlosserousde = 140;
   let rhischlosseroushe = 130;
    
    
   let hykeynaid = 112;
   let hykeynaat = 140;
   let hykeynasp = 88;
   let hykeynade = 64;
   let hykeynahe = 130;

   let tafantulaid = 113;
   let tafantulaat = 130;
   let tafantulasp = 90;
   let tafantulade = 89;
   let tafantulahe = 140;

   let farmotid = 114;
   let farmotat = 94;
   let farmotsp = 71;
   let farmotde = 87;
   let farmothe = 176;

   let beeurchinid = 115;
   let beeurchinat = 176;
   let beeurchinsp = 87;
   let beeurchinde = 71;
   let beeurchinhe = 94;

   let flyinsoupid = 116;
   let flyinsoupat = 117;
   let flyinsoupsp = 103;
   let flyinsoupde = 98;
   let flyinsouphe = 89;

   let meloncollieid = 117;
   let meloncollieat = 89;
   let meloncolliesp = 100;
   let meloncolliede = 100;
   let meloncolliehe = 117;

   let scorphibianid = 118;
   let scorphibianat = 180;
   let scorphibiansp = 79;
   let scorphibiande = 80;
   let scorphibianhe = 81;

   let geliphantid = 119;
   let geliphantat = 78;
   let geliphantsp = 78;
   let geliphantde = 78;
   let geliphanthe = 219;

   let chimpansyid = 120;
   let chimpansyat = 123;
   let chimpansysp = 123;
   let chimpansyde = 75;
   let chimpansyhe = 91;
    
   let xaltoxisid = 121;
   let xaltoxisat = 120;
   let xaltoxissp = 154;
   let xaltoxisde = 60;
   let xaltoxishe = 93;
    
   let avokaboomid = 122;
   let avokaboomat = 170;
   let avokaboomsp = 69;
   let avokaboomde = 51;
   let avokaboomhe = 165;
    
   let eggressid = 123;
   let eggressat = 340;
   let eggresssp = 73;
   let eggressde = 51;
   let eggresshe = 80;
    
   let zentapedeid = 124;
   let zentapedeat = 65;
   let zentapedesp = 201;
   let zentapedede = 65;
   let zentapedehe = 118;
    
   let probocetusid = 125;
   let probocetusat = 66;
   let probocetussp = 97; //90
   let probocetusde = 160; //150
   let probocetushe = 111;

   let tankgolinid = 126;
   let tankgolinat = 130;
   let tankgolinsp = 104; //90
   let tankgolinde = 130; //150
   let tankgolinhe = 63;

   let spiekgulid = 127;
   let spiekgulat = 69;
   let spiekgulsp = 59; //90
   let spiekgulde = 321; //150
   let spiekgulhe = 87;


   let mnemontid = 128;
   let mnemontat = 59;
   let mnemontsp = 69;
   let mnemontde = 87;
   let mnemonthe = 321;


   let banandroidid = 129;
   let banandroidat = 69;
   let banandroidsp = 350;
   let banandroidde = 69;
   let banandroidhe = 61;


   let piginid = 130;
   let piginat = 60;
   let piginsp = 150;
   let piginde = 74;
   let piginhe = 150;


   let qqqid = 0;
   let qqqat = 100; //
   let qqqsp = 100; //
   let qqqde = 100; //
   let qqqhe = 100;  //







    let tutorial_canvas = document.getElementById("tutorial");


    let tutorial_canvas_context = tutorial_canvas.getContext('2d');
    tutorial_canvas_context.imageSmoothingEnabled= true

 //   tutorial_canvas_context.scale(.1, .1);
    tutorial_canvas.style.background = "#FFFFFF"


    let flex = tutorial_canvas.getBoundingClientRect();

    // Add the event listeners for mousedown, mousemove, and mouseup
    let tip = {}
    let xs
    let ys
   
   
    
    window.addEventListener('mousedown', e => {
 
 
    //  countertron++
 
    //  team[selector] = monstlist(countertron%131)
 
          flex = tutorial_canvas.getBoundingClientRect();
          xs = e.clientX - flex.left;
          ys = e.clientY - flex.top;
          tip.x = xs
          tip.y = ys
    
          tip.body = tip

          if(monster2.health <= 0){
            if(capture.isPointInside(tip)){
                let teammember = monster2.deepclone()
                team.push(teammember)
                 monster2 = monstlist(Math.floor(Math.random()*131)) .clone()
          }
          }


          if(selector<team.length-1){
            if(swapup.isPointInside(tip)){
                for(let t = 0;t<team.length;t++){
                    team[t].reset()
                }
                  selector++
            }
        }
      if(selector>0){
        if(swapdown.isPointInside(tip)){      
              for(let t = 0;t<team.length;t++){
            team[t].reset()
        }
          selector--
        }
      }
          if(selector>team.length-1){
              selector= team.length-1
          }
          if(selector<0){
              selector=0
          }
          monster2.target = team[selector]
          team[selector].target = monster2


    if(team[selector].turn == 1){
          if(attackbutton.isPointInside(tip)){
            team[selector].strike()
            team[selector].TurnDamageResolution() 
            //console.log(team[selector])
            //console.log(monster2)
        }
        if(specialbutton.isPointInside(tip)){
            team[selector].specialattack()
            team[selector].TurnDamageResolution() 
            //console.log(team[selector])
            //console.log(monster2)
        }
        if(healbutton.isPointInside(tip)){
            team[selector].heal()
            team[selector].TurnDamageResolution() 
            //console.log(team[selector])
            //console.log(monster2)
        }
        if(boostbutton.isPointInside(tip)){
            team[selector].boost()
            team[selector].TurnDamageResolution() 
            //console.log(team[selector])
            //console.log(monster2)
        }
    }else{

        if(attackbutton2.isPointInside(tip)){
            monster2.strike()
            monster2.TurnDamageResolution() 
            //console.log(team[selector])
            //console.log(monster2)
        }
        if(specialbutton2.isPointInside(tip)){
            monster2.specialattack()
            monster2.TurnDamageResolution() 
            //console.log(team[selector])
            //console.log(monster2)
        }
        if(healbutton2.isPointInside(tip)){
            monster2.heal()
            monster2.TurnDamageResolution() 
            //console.log(team[selector])
            //console.log(monster2)
        }
        if(boostbutton2.isPointInside(tip)){
            monster2.boost()
            monster2.TurnDamageResolution() 
            //console.log(team[selector])
            //console.log(monster2)
        }
 
    }


            console.log(team[selector])
            console.log(monster2)

     });
    
   
    

    // let img = new Image()
    // img.src = '/Users/coleditzler/Downloads/Moon-Colony-master/protomon/daahnida.svg';

    // let img2 = new Image()
    // img2.src = '/Users/coleditzler/Downloads/Moon-Colony-master/protomon/grobhost.svg';




    class Monster{
        constructor(id, speed, attack, defense, health){  //, maxhealth, health, speed, attack, defense, akmv, spmv, dfmv, hpmv,  )
        this.id = id
        this.turn = -1
        this.target = {}
        this.uniqueID = Math.floor(Math.random()*100000000)
        this.maxhealth = health+50
        this.health = health+50
        this.speed = speed+50
        this.attack = attack+50
        this.defense = defense+50
        this.akmv = Math.floor(Math.random()*9)
        this.spmv = Math.floor(Math.random()*17)
        this.dfmv = Math.floor(Math.random()*16)
        this.hpmv = Math.floor(Math.random()*11)
        this.hpname = HealingMoveNames(this.hpmv)
        this.spname = StatsMoveNames(this.spmv)
        this.dfname = SpecialMoveNames(this.dfmv)
        this.akname = attackMoveNames(this.akmv)
        this.elongatedhealwoundtimer = 0
        this.healblocktimer = 0
        this.delayedhealpower = 0
        this.delayedhealtimer = 0
        this.elongatedhealtimer = 0
        this.elongatedhealpower = 0
        this.elongatedwoundtimer = 0
        this.elongatedglugpower = 0
        this.grouphealtimer = 0
        this.delayedstatmove = -1
        this.elongatedwoundpower = 0
        this.elongatedwoundtimer = 0


        this.reflectratio = 0;
        this.reflecttimer = 0;
        this.protectstatstimer = 0;
        this.delayedblastpower = 0;
        this.delayedhealtimer = 0;
        this.delayedhealpower = 0;
        this.delayedhealtimersnow = 0;
        this.delayedhealpowersnow = 0;
        this.delayedblasttimer = 0;
        this.statdelaytimer = -1;
        this.delayedstatmove = -1;
        this.grouphealtimer = 0;
        this.grouphealpower = 0;
        this.elongatedhealtimer = 0;
        this.elongatedhealpower = 0;
        this.elongatedhealwoundpower = 0

                this.healblocktimer = 0;
                this.elongatedhealwoundtimer = 0;
                this.elongatedwoundtimer = 0;
                this.elongatedglugpower = 0;
                this.elongatedglugtimer = 0;
                this.statblocktimer = 0;



        this.reflectratio = 0
        this.reflecttimer = 0

        let imageholder = new Image()
        imageholder.src = srcnames(id)+".svg"


        this.img = imageholder
        //////console.log(this.img)
        }
        turnResolver(){
            team[selector].turn *= -1
            // this.target.turn *= -1
        }
        reset(){
            let statclone = monstlist(this.id).statclone()

            this.speed = statclone.speed
            this.defense = statclone.defense
            this.attack = statclone.attack
        }
        clone(){
            let monster = new Monster(this.id, this.speed-50, this.attack-50, this.defense-50, this.health-50)
            return monster
        }
        deepclone(){
            let monster = new Monster(this.id, this.speed-50, this.attack-50, this.defense-50, this.health-50)
            
            monster.maxhealth = monstlist(this.id).clone().maxhealth
            monster.akmv =this.akmv
            monster.spmv = this.spmv 
            monster.dfmv = this.dfmv
            monster.hpmv = this.hpmv 
            monster.hpname = this.hpname 
            monster.dfname = this.dfname 
            monster.akname = this.akname 
            monster.spname = this.spname 
                
            return monster
        }
        statclone(){
            let thing = {}
            thing.attack = this.attack
            thing.defense = this.defense
            thing.speed = this.speed
            thing.health = this.health
            return thing
        }
        boostResolve(){

            let holdspeed = this.speed
            if(this.statdelaytimer > 0 && (this.health > 0 )){
                this.statdelaytimer--;
            }

            if(this.statdelaytimer == 0) {
    
                this.statdelaytimer  = -1;

            if (this.statblocktimer == 0) {
                switch (this.delayedstatmove){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 7:
                        //console.log(this.spmv)
                        this.attack = this.attack * CbrtTwo ;
                        this.attack = Math.round(this.attack);
                        this.speed = this.speed * CbrtTwo ;
                        this.speed = Math.round(this.speed);
                        this.defense = this.defense * CbrtTwo ;
                        this.defense = Math.round(this.defense);
                        break;
                    case 8:
    
                        //console.log(this.spmv)
                        this.speed = this.speed * SqrtTwo ;
                        this.speed = Math.round(this.speed);
                        this.defense = this.defense * SqrtTwo ;
                        this.defense = Math.round(this.defense);
                        break;
                    case 9:
                        //console.log(this.spmv)
                        this.attack = this.attack * SqrtTwo ;
                        this.attack = Math.round(this.attack);
                        this.defense = this.defense * SqrtTwo ;
                        this.defense = Math.round(this.defense);
                        break;
                    case 10:
                        //console.log(this.spmv)
                        this.attack = this.attack * SqrtTwo ;
                        this.attack = Math.round(this.attack);
                        this.speed = this.speed * SqrtTwo ;
                        this.speed = Math.round(this.speed);
                        break;
                    case 11:
                        //console.log(this.spmv)
                        this.speed = this.speed * 2 ;
                        this.speed = Math.round(this.speed);
                        break;
                    case 12:
                        //console.log(this.spmv)
                        this.defense = this.defense * 2 ;
                        this.defense = Math.round(this.defense);
                        break;
                    case 13:
                        //console.log(this.spmv)
                        this.attack = this.attack * 2 ;
                        this.attack = Math.round(this.attack);
                        break;
                }
            }
            }
    
            if(this.speed > this.target.speed && holdspeed < this.target.speed){
                this.turnResolver()
            }
        }

        Reflect(passreflectplayer) {
            if(this.target.reflecttimer > 0){
                let reflecteddamahe = (passreflectplayer * (this.target.reflectratio/100));
                // //console.log(this.health, reflecteddamahe)
                this.target.health = this.target.health + reflecteddamahe;   
                this.health = this.health - reflecteddamahe;
                //console.log(this, this.target)
            }
            if (this.target.reflecttimer == 0){
                this.target.reflectratio = 0;
            }
        }
        specialattack(){


            let thatClone = this.target.statclone()
            let copyPlayermoveforattacker = 4;
           let whosturnisitanyway = 1;
           let  Damage = 0;
            if (this.dfmv == 0) {
                ////console.log("hit")

                this.target.elongatedwoundtimer = this.target.elongatedwoundtimer + 10;
                let healtester = (3 * ( (((Math.random()*(21) + 70)) * (this.speed / this.target.defense)))) / 17;
                healtester = Math.round(healtester);
                if (healtester > this.target.elongatedwoundpower) {
                    this.target.elongatedwoundpower = healtester;
                }
            } else if (this.dfmv == 1) {
                this.delayedblastpower =  (((Math.random()*(21) + 65)) * (this.attack / this.target.speed));
                if (this.delayedblasttimer == 0) {
                    this.delayedblasttimer = 1;
                }
            } else if (this.dfmv == 2) {
                this.target.elongatedhealwoundtimer = this.target.elongatedhealwoundtimer + 10;
                let healtester = (3 * ( (((Math.random()*(11) + 35)) * (this.speed / this.target.defense)))) / 14;
                healtester = Math.round(healtester);
                if (healtester > this.target.elongatedhealwoundpower) {
                    this.target.elongatedhealwoundpower = healtester;
                }

            } else if (this.dfmv == 3) {
                this.target.elongatedglugtimer = this.target.elongatedglugtimer + 10;
                let healtester = (3 * ( (((Math.random()*(11) + 35)) * (this.speed / this.target.defense)))) / 14; // was 12 7/7/19
                healtester = Math.round(healtester);
                if (healtester > this.elongatedglugpower) {
                    this.target.elongatedglugpower = healtester;
                } // Work in progress, attack 3 is life glug over time
            } else if (this.dfmv == 4) {
                this.target.healblocktimer = this.target.healblocktimer + 7;
            }else if (this.dfmv == 5) {
                Damage = (((Math.random()*(11) + 25)) * (this.defense / this.target.defense)); // changed to D/D from A/D
                Damage = Math.round(Damage);
                if (this.target.defense >= statMinimum){
                    this.target.defense = Math.round(this.target.defense * .85);
                }
                if (this.target.defense <= statMinimum){
                    this.target.defense = statMinimum;
                }
                this.target.health = this.target.health - Damage;
                this.Reflect(Damage);
            }



            if (this.dfmv == 6) {
                Damage = (((Math.random()*(11) + 25)) * (this.speed / this.target.speed));
                Damage = Math.round(Damage);
                if (this.target.speed >= statMinimum){
                    this.target.speed = Math.round(this.target.speed * .85);
                }
                if (this.target.speed <= statMinimum){
                    this.target.speed = statMinimum;
                }
                this.target.health = this.target.health - Damage;
                this.Reflect(Damage);
            }else if (this.dfmv == 7) {
                Damage = (((Math.random()*(11) + 25)) * (this.attack / this.target.attack));
                Damage = Math.round(Damage);
                if (this.target.attack >= statMinimum){
                    this.target.attack = Math.round(this.target.attack * .85);
                }
                if (this.target.attack <= statMinimum){
                    this.target.attack = statMinimum;
                }
                this.target.health = this.target.health - Damage;
                this.Reflect(Damage);
            }

            
             if (this.dfmv == 8) {
                this.target.statblocktimer = this.target.statblocktimer + 7;
            } else if (this.dfmv == 9) {
                this.healblocktimer = 0;
                this.elongatedhealwoundtimer = 0;
                this.elongatedwoundtimer = 0;
                this.elongatedglugtimer = 0;
                this.statblocktimer = 0;
                Damage = (((Math.random()*(11) + 35)) * (this.attack / this.target.defense));
                Damage = Math.round(Damage);
                this.target.health = this.target.health - Damage;
                this.Reflect(Damage);
            } else if (this.dfmv == 10) {
                let holdA =  this.attack;
                let holdD =  this.defense;
                let holdS =  this.speed;
                let holdAx =  this.target.attack;
                let holdDx =  this.target.defense;
                let holdSx =  this.target.speed;
                let sumall = 0;
                let sumallx = 0;
                this.attack = Math.round(this.attack*.77);
                this.defense = Math.round(this.defense*.77);
                this.speed = Math.round(this.speed*.77);
                sumall = ((holdA) + (holdD) + (holdS));
                sumallx = ((holdAx) + (holdDx) + (holdSx));
                Damage =  (sumall/sumallx) * (((Math.random()*(51)+100)));
                Damage = Math.round(Damage);
                this.target.health = this.target.health - Damage;
                this.Reflect(Damage);
                if (holdS > holdSx && this.speed <= this.target.speed){
                    this.turnResolver()
                }
                StatAbuseCurb(this);
                StatAbuseCurb(this.target);
            }else if (this.dfmv == 11) {
                Damage = (((Math.random()*(11) + 25)) * ((this.speed+this.attack+ this.defense) / (this.target.speed+this.target.attack+ this.target.defense)));
                Damage = Math.round(Damage);

                this.target.speed = Math.round(this.target.speed * .95);
                this.target.defense = Math.round(this.target.defense * .95);
                this.target.attack = Math.round(this.target.attack * .95);
                
                this.target.health = this.target.health - Damage;
                this.Reflect(Damage);
                StatAbuseCurb(this);
                StatAbuseCurb(this.target);
            }else if (this.dfmv == 12) {
                //Snatch

                if (this.delayedblasttimer < this.target.delayedblasttimer){
                    this.delayedblasttimer = this.target.delayedblasttimer;
                }
                if (this.delayedblastpower < this.target.delayedblastpower){
                    this.delayedblastpower = this.target.delayedblastpower;
                }
                if (this.delayedhealtimer < this.target.delayedhealtimer){
                    this.delayedhealtimer = this.target.delayedhealtimer;
                }
                if (this.delayedhealpower < this.target.delayedhealpower){
                    this.delayedhealpower = this.target.delayedhealpower;
                }
                if (this.delayedhealtimersnow < this.target.delayedhealtimersnow){
                    this.delayedhealtimersnow = this.target.delayedhealtimersnow;
                }
                if (this.delayedhealpowersnow < this.target.delayedhealpowersnow){
                    this.delayedhealpowersnow = this.target.delayedhealpowersnow;
                }
                if (this.target.protectstatstimer > this.protectstatstimer){
                    this.protectstatstimer = this.target.protectstatstimer;
                }

                if (this.target.statdelaytimer != -1){
                    this.statdelaytimer = this.target.statdelaytimer;
                }
                if (this.target.delayedstatmove != -1){
                    this.delayedstatmove = this.target.delayedstatmove;
                }
                if (this.grouphealtimer < this.target.grouphealtimer){
                    this.grouphealtimer = this.target.grouphealtimer;
                }
                if (this.grouphealpower < this.target.grouphealpower){
                    this.grouphealpower = this.target.grouphealpower;
                }
                if (this.elongatedhealtimer < this.target.elongatedhealtimer){
                    this.elongatedhealtimer = this.target.elongatedhealtimer;
                }
                if (this.elongatedhealpower < this.target.elongatedhealpower){
                    this.elongatedhealpower = this.target.elongatedhealpower;
                }

                if (this.target.reflecttimer > this.reflecttimer){
                    this.reflecttimer  = this.target.reflecttimer;
                }
                if (this.target.reflectratio > this.reflectratio){
                    this.reflectratio = this.target.reflectratio;
                }



                this.target.reflectratio = 0;
                this.target.reflecttimer = 0;



                this.target.protectstatstimer = 0;
                this.target.delayedblastpower = 0;
                this.target.delayedhealtimer = 0;
                this.target.delayedhealpower = 0;
                this.target.delayedhealtimersnow = 0;
                this.target.delayedhealpowersnow = 0;
                this.target.delayedblasttimer = 0;
                this.target.statdelaytimer = -1;
                this.target.delayedstatmove = -1;
                this.target.grouphealtimer = 0;
                this.target.grouphealpower = 0;
                this.target.elongatedhealtimer = 0;
                this.target.elongatedhealpower = 0;


            }else if (this.dfmv == 13) {
                //Dispel

                // ResetWounds();

                this.target.delayedhealtimersnow = 0;
                this.target.delayedhealpowersnow = 0;
                this.target.reflectratio = 0;
                this.target.reflecttimer = 0;
                this.target.protectstatstimer = 0;
                this.target.delayedblastpower = 0;
                this.target.delayedhealtimer = 0;
                this.target.delayedblasttimer = 0;
                this.target.delayedhealpower = 0;
                this.target.statdelaytimer = -1;
                this.target.delayedstatmove = -1;
                this.target.grouphealtimer = 0;
                this.target.grouphealpower = 0;
                this.target.elongatedhealtimer = 0;
                this.target.elongatedhealpower = 0;

                Damage = (((Math.random()*(11) + 25)) * (this.attack / this.target.defense));
                Damage = Math.round(Damage);
                this.target.health = (this.target.health - Damage);
                this.Reflect(Damage);
            }else if (this.dfmv == 14) {

                this.protectstatstimer = this.protectstatstimer + 11;
            }else if (this.dfmv == 15) {
                this.reflecttimer = this.reflecttimer + 7;
                let fx =(this.defense/this.speed);


                // fx = (((-1.488*(fx*fx)) + (26.61*fx)) - 0.119);

                fx = (0.449*((25*fx) -(fx*fx))) + 17;


                if (this.reflectratio <= fx ){
                    this.reflectratio = fx;
                }
            }else if (this.dfmv == 16) {
                //console.log("this is too big to port right now")
                // disgustingworkaround = 1;
                // disgustingworkaroundst = 3;
                // switch (copyattackermoveforplayer){
                //     case 0:
                //         PlayBrainMethod(Turn);
                //         break;
                //     case 1:
                //         let holdmove = this.dfmv;
                //         this.dfmv = this.target.dfmv;
                //         PlayBrainMethod(Turn);
                //         this.dfmv = holdmove;
                //         break;
                //     case 2:
                //         let holdmoveh = this.hpmv;
                //         this.hpmv = this.target.hpmv;
                //         PlayBrainMethod(HealButton);
                //         this.hpmv = holdmoveh;
                //         break;
                //     case 3:
                //         let holdmoves = this.spmv;
                //         this.spmv = this.target.spmv;
                //         PlayBrainMethod(Status);
                //         this.spmv = holdmoves;
                //         break;
                //     case 4:
                //         let holdmovep = this.dfmv;
                //         this.dfmv = this.target.dfmv;
                //         if(this.dfmv == 16) {
                //             PlayBrainMethod(Turn);
                //         }else{
                //             PlayBrainMethod(Specialattack);
                //         }
                //         this.dfmv = holdmovep;
                //         break;
                // }copyattackermoveforplayer = 0;

                // CombatStringHolder = CombatString;
               // disgustingworkaround = 0;
            }else if (this.dfmv == 17) {

                Damage = (((Math.random()*(21) + 50)) * (this.attack / this.target.attack));
                Damage = Math.round(Damage);

                this.target.health = (this.target.health - Damage);
                this.Reflect(Damage);
            }


            if(this.target.protectstatstimer > 0){
                this.revertStats(thatClone)
            }


        }
        strike(){
               let  copyattackermoveforplayer = 1;
                let whosturnisitanyway = 0;
               let Damage = 0;
    
                let Catchsopmekindofattack = " attacks ";
    


                switch (this.akmv){

                    case 0:
                        Damage = ((this.attack / this.target.defense) * (Math.random()*(21) + 50));
    
                        Catchsopmekindofattack = " attacks For ";
                        break;
    
                    case 1:
                        Damage = ((this.attack / this.target.speed) * (Math.random()*(21) + 50));
                        Catchsopmekindofattack = " Advances For ";
                        break;
    
                    case 2:
                        Damage = ((this.attack / this.target.attack) * (Math.random()*(21) + 50));
                        Catchsopmekindofattack = " Overpowers For ";
    
                        break;
    
    
                    case 3:
                        Damage = ((this.speed / this.target.defense) * (Math.random()*(21) + 50));
                        Catchsopmekindofattack = " Punctures For ";
                        break;
    
                    case 4:
                        Damage = ((this.speed / this.target.speed) * (Math.random()*(21) + 50));
                        Catchsopmekindofattack = " Races For ";
                        break;
    
                    case 5:
                        Damage = ((this.speed / this.target.attack) * (Math.random()*(21) + 50));
                        Catchsopmekindofattack = " Exhausts For ";
                        break;
    
                    case 6:
                        Damage = ((this.defense / this.target.defense) * (Math.random()*(21) + 50));
                        Catchsopmekindofattack = " Collides For ";
                        break;
    
                    case 7:
                        Damage = ((this.defense / this.target.speed) * (Math.random()*(21) + 50));
                        Catchsopmekindofattack = " Obstructs For ";
                        break;
    
                    case 8:
                        Damage = ((this.defense / this.target.attack) * (Math.random()*(21) + 50));
                        Catchsopmekindofattack = " Beams Block For ";
                        break;
    
    
                }
    
    
                ////console.log(Damage)
    
    
                Damage = Math.round(Damage);
                this.target.health = this.target.health - Damage;
                this.Reflect(Damage);
    
    

        }
        boost(){

            let holdspeed = this.speed
            let copyPlayermoveforattacker = 3;
            let whosturnisitanyway = 1;
            let Damage = 0;
            if(this.statblocktimer == 0){
            if (this.spmv == 0) {
                    this.speed = this.speed * FrrtTwo;
                    this.speed = Math.round(this.speed);
                    this.defense = this.defense * FrrtTwo;
                    this.defense = Math.round(this.defense);
                    this.attack = this.attack * FrrtTwo;
                    this.attack = Math.round(this.attack);
            } else if (this.spmv == 1) {
                this.speed = this.speed * CbrtTwo;
                this.speed = Math.round(this.speed);
                this.defense = this.defense * CbrtTwo;
                this.defense = Math.round(this.defense);
            } else if (this.spmv == 2) {
                this.defense = this.defense * CbrtTwo;
                this.defense = Math.round(this.defense);
                this.attack = this.attack * CbrtTwo;
                this.attack = Math.round(this.attack);
            } else if (this.spmv == 3) {
                this.attack = this.attack * CbrtTwo;
                this.attack = Math.round(this.attack);
                this.speed = this.speed * CbrtTwo;
                this.speed = Math.round(this.speed);
            } else if (this.spmv == 4) {
                this.speed = this.speed * SqrtTwo;
                this.speed = Math.round(this.speed);
            } else if (this.spmv == 5) {
                this.defense = this.defense * SqrtTwo;
                this.defense = Math.round(this.defense);
            } else if (this.spmv == 6) {
                this.attack = this.attack * SqrtTwo;
                this.attack = Math.round(this.attack);
            } 
        }
            
            
             if (this.spmv > 6 && this.statdelaytimer == -1 && this.spmv < 14) {
                 if(this.statdelaytimer == -1){
                    this.statdelaytimer = 3;
                 }
                this.delayedstatmove =  this.spmv;
            }else if (this.spmv == 14) {
                if (this.statblocktimer == 0) {
                this.speed = this.speed * FrrtTwo;
                this.speed = Math.round(this.speed);
                }
                this.target.speed = (this.target.speed / FrrtTwo);
                this.target.speed = Math.round(this.target.speed);
            }else if (this.spmv == 15) {
                if (this.statblocktimer == 0) {
                this.defense = this.defense * FrrtTwo;
                this.defense = Math.round(this.defense);
                }
                this.target.defense = (this.target.defense / FrrtTwo);
                this.target.defense = Math.round(this.target.defense);
            }else if (this.spmv == 16) {
                if (this.statblocktimer == 0) {
                this.attack = this.attack * FrrtTwo;
                this.attack = Math.round(this.attack);
                }
                this.target.attack = (this.target.attack / FrrtTwo);
                this.target.attack = Math.round(this.target.attack);
            }


            if(this.speed > this.target.speed && holdspeed < this.target.speed){
                this.turnResolver()
            }

        }
        heal(){


            let holdspeed = this.speed
            let Damage = 0;
            if (this.hpmv == 0) {
                if (this.healblocktimer == 0 && this.elongatedhealwoundtimer == 0) {
                    Damage = (((Math.random()*(11) + 55)) * (this.speed / this.defense));
                    Damage = Math.round(Damage);
                    this.health = this.health + Damage;
                }
                if (this.elongatedhealwoundtimer != 0 && this.healblocktimer == 0 ) {
                    Damage = (((Math.random()*(11) + 55)) * (this.speed / this.defense));
                    Damage = Math.round(Damage);
                    this.health = this.health + Math.round(Damage / 2);
                }
            } else if (this.hpmv == 1) {
                Damage =  (((Math.random()*(11) + 65)) * (this.speed / this.defense));
                if(Damage >= this.delayedhealpower) {
                    this.delayedhealpower =  Damage;
                }
                if (this.delayedhealtimer == 0) {
                    this.delayedhealtimer = 1;
                }
            } else if (this.hpmv == 2) {
                this.elongatedhealtimer = this.elongatedhealtimer + 5;
                let healtester = (3 * ( (((Math.random()*(21) + 45)) * (this.speed / this.defense)))) / 7; // 45 was 65 ALLMARK 6/22/19
                healtester = Math.round(healtester);
                if (healtester > this.elongatedhealpower) {
                    this.elongatedhealpower = healtester;
                }

            } else if (this.hpmv == 3) {
                Damage = (((Math.random()*(11) + 35)) * (this.attack / this.target.defense));// was 25 now 35  11) + 35
                Damage = Math.round(Damage);
                if (this.healblocktimer == 0 && this.elongatedhealwoundtimer == 0) {
                    this.health = this.health + Damage;
                } else if (this.elongatedhealwoundtimer > 0 && this.healblocktimer == 0) {
                    this.health = this.health + Math.round(Damage / 2);
                }
                this.target.health = this.target.health - Damage;
                this.Reflect(Damage);
            } else if (this.hpmv == 4) {
                this.healblocktimer = 0;
                this.elongatedhealwoundtimer = 0;
                this.elongatedwoundtimer = 0;
                this.elongatedglugpower = 0;
                this.statblocktimer = 0;
                Damage = (((Math.random()*(11) + 35)) * (this.speed / this.defense));
                Damage = Math.round(Damage);
                this.health = this.health + Damage;
            }else if (this.hpmv == 5) {
                this.grouphealtimer = this.grouphealtimer + 7;
                let healtester = (3 * ( (((Math.random()*(6) + 15)) * (this.speed / this.defense)))) / 7;
                healtester = Math.round(healtester);
                if (healtester > this.grouphealpower) {
                    this.grouphealpower = healtester;
                }
            }else if (this.hpmv == 6) {
                if (this.healblocktimer == 0 && this.elongatedhealwoundtimer == 0) {
                    Damage = (((Math.random()*(11) + 55)) * (( this.speed + this.defense + this.attack ) / this.maxhealth));
                    Damage = Math.round(Damage*.381);
                    this.health = this.health + Damage;
                }
                if (this.elongatedhealwoundtimer != 0 && this.healblocktimer == 0) {
                    Damage = (((Math.random()*(11) + 55)) * (( this.speed + this.defense + this.attack ) / this.maxhealth));
                    Damage = Math.round(Damage*.381);
                    this.health = this.health + Math.round(Damage / 2);
                }
                this.attack = Math.round((this.attack*1.0167));
                this.defense = Math.round((this.defense*1.0167));
                this.speed = Math.round((this.speed*1.0167));
            }
            let thisClone = this.statclone()
            if (this.hpmv == 7) {
                if (this.healblocktimer == 0 && this.elongatedhealwoundtimer == 0) {
                    Damage = (((Math.random()*(11) + 55)) * (this.speed / (this.defense + this.attack)));
                    Damage = Math.round(Damage*1.80);
                    this.health = this.health + Damage;
                }
                if (this.elongatedhealwoundtimer != 0 && this.healblocktimer == 0) {
                    Damage = (((Math.random()*(11) + 55)) * (this.speed /(this.defense + this.attack)));
                    Damage = Math.round(Damage*1.80);
                    this.health = this.health + Math.round(Damage / 2);
                }
                this.speed = Math.round((this.speed*1.05));
            }else if (this.hpmv == 8) {
                if (this.healblocktimer == 0 && this.elongatedhealwoundtimer == 0) {
                    Damage = (((Math.random()*(11) + 55)) * (this.attack / (this.defense + this.speed)));
                    Damage = Math.round(Damage*1.80);
                    this.health = this.health + Damage;
                }
                if (this.elongatedhealwoundtimer != 0 && this.healblocktimer == 0) {
                    Damage = (((Math.random()*(11) + 55)) * (this.attack / (this.defense + this.speed)));
                    Damage = Math.round(Damage*1.80);
                    this.health = this.health + Math.round(Damage / 2);
                }
                this.attack = Math.round((this.attack*1.05));
            }else if (this.hpmv == 9) {
                if (this.healblocktimer == 0 && this.elongatedhealwoundtimer == 0) {
                    Damage = (((Math.random()*(11) + 55)) * (this.defense / (this.speed + this.attack)));
                    Damage = Math.round(Damage*1.80);
                    this.health = this.health + Damage;
                }
                if (this.elongatedhealwoundtimer != 0 && this.healblocktimer == 0) {
                    Damage = (((Math.random()*(11) + 55)) * (this.defense /(this.speed + this.attack)));
                    Damage = Math.round(Damage*1.80);
                    this.health = this.health + Math.round(Damage / 2);
                }
                this.defense = Math.round((this.defense*1.05));
            }else if (this.hpmv == 10) {
              // let snowball
                Damage = ((((Math.random()*(11) + 55)) * (( this.speed + this.defense + this.attack ) / this.maxhealth)) * 2);
                Damage = Math.round(Damage*.381);
                if(Damage >= this.delayedhealpowersnow) {
                    this.delayedhealpowersnow =  Damage;
                }
                if (this.delayedhealtimersnow == 0) {
                    this.delayedhealtimersnow = 1;
                }
            }
            if (this.health > this.maxhealth) {
                this.health = this.maxhealth;
            }

            if(this.statblocktimer > 0){
                this.revertStats(thisClone)
            }


            if(this.speed > this.target.speed && holdspeed < this.target.speed){
                this.turnResolver()
            }
        }
     TurnDamageResolution() {
        if (this.health > 0 && this.target.health > 0) {

            this.turnResolver()
            this.boostResolve()
            this.target.boostResolve()

            let thisClone = this.statclone()
            let thatClone = this.target.statclone()

            let Holdthisformeplayer =  this.health;
            let HoldthisformeplayerReflect =  this.health;
            let HoldthisformeplayerReflectx =  this.health;
            let Holdthisformemonster =  this.target.health;
            let HoldthisformemonsterReflect =  this.target.health;
            let HoldthisformemonsterReflectx =  this.target.health;
            let Holdthisformemonsterwounds =  this.target.health;
            let Holdthisformeplayerwounds =  this.health;


            if (this.statblocktimer > 0){
                this.statblocktimer--;
            }
            if (this.target.statblocktimer > 0){
                this.target.statblocktimer--;
            }

            if(this.target.delayedhealtimer > 0){
                this.target.delayedhealtimer++;
            }

            if(this.protectstatstimer > 0) {
                this.protectstatstimer--;

            }
            if(this.target.protectstatstimer > 0) {
                this.target.protectstatstimer--;

            }
            if(this.target.delayedhealtimer > 3 && (this.health > 0 && this.target.health > 0)){
                this.target.health = this.target.health + this.target.delayedhealpower;
                this.target.delayedhealpower = 0;
                this.target.delayedhealtimer = 0;
            }

            
            
            if(this.target.delayedhealtimersnow > 0){
                this.target.delayedhealtimersnow++;
            }
            if(this.target.delayedhealtimersnow > 3 && (this.health > 0 && this.target.health > 0)){
                this.target.health = this.target.health + this.target.delayedhealpowersnow;
                this.target.delayedhealpowersnow = 0;
                this.target.delayedhealtimersnow = 0;

                this.target.attack = Math.round((this.target.attack*1.0167));
                this.target.defense = Math.round((this.target.defense*1.0167));
                this.target.speed = Math.round((this.target.speed*1.0167));
                this.target.attack = Math.round((this.target.attack*1.0167));
                this.target.defense = Math.round((this.target.defense*1.0167));
                this.target.speed = Math.round((this.target.speed*1.0167));
            }




            if(this.delayedhealtimer > 0){
                this.delayedhealtimer++;
            }


            if(this.delayedhealtimer > 3 && (this.health > 0 && this.target.health > 0)){
                this.health = this.health + this.delayedhealpower;
                this.delayedhealpower = 0;
                this.delayedhealtimer = 0;
            }

            if(this.delayedhealtimersnow > 0){
                this.delayedhealtimersnow++;
            }


            if(this.delayedhealtimersnow > 3 && (this.health > 0 && this.target.health > 0)){
                this.health = this.health + this.delayedhealpowersnow;
                this.delayedhealpowersnow = 0;
                this.delayedhealtimersnow = 0;

                this.attack = Math.round((this.attack*1.0167));
                this.defense = Math.round((this.defense*1.0167));
                this.speed = Math.round((this.speed*1.0167));
                this.attack = Math.round((this.attack*1.0167));
                this.defense = Math.round((this.defense*1.0167));
                this.speed = Math.round((this.speed*1.0167));
            }





            if (this.target.elongatedhealtimer == 0) {
                this.target.elongatedhealpower = 0;
            }

            if (this.elongatedhealtimer == 0) {
                this.elongatedhealpower = 0;
            }



            if (this.elongatedhealtimer > 0) {
                this.elongatedhealtimer--;
                this.health = this.elongatedhealpower + this.health;
            }


            if (this.target.elongatedhealtimer > 0) {
                this.target.elongatedhealtimer--;
                this.target.health = this.target.elongatedhealpower + this.target.health;
            }


            if (this.target.elongatedglugtimer == 0) {
                this.target.elongatedglugtimer = 0;
            }
            if (this.elongatedglugtimer == 0) {
                this.elongatedglugpower = 0;
            }

            if (this.target.elongatedglugtimer > 0) {
                this.target.elongatedglugtimer--;
                this.health = this.health + this.target.elongatedglugpower;
                this.target.health = this.target.health - this.target.elongatedglugpower;
                HoldthisformemonsterReflect = HoldthisformemonsterReflect - this.target.elongatedglugpower;
                Holdthisformemonsterwounds = Holdthisformemonsterwounds - this.target.elongatedglugpower;
                Holdthisformemonster = Holdthisformemonster - this.target.elongatedglugpower;

            }

            if (this.elongatedglugtimer > 0) {
                this.elongatedglugtimer--;
                this.target.health = this.target.health + this.elongatedglugpower;
                this.health = this.health - this.elongatedglugpower;
                HoldthisformeplayerReflect = HoldthisformeplayerReflect - this.elongatedglugpower;
                Holdthisformeplayerwounds = Holdthisformeplayerwounds - this.elongatedglugpower;
                Holdthisformeplayer = Holdthisformeplayer - this.elongatedglugpower;
            }

            if (this.target.healblocktimer > 0 && this.health >= Holdthisformeplayer){
                this.health = Holdthisformeplayer;
            }if (this.healblocktimer > 0 && this.target.health >= Holdthisformemonster){
                this.target.health = Holdthisformemonster;
            }

            if (this.healblocktimer > 0){
                this.healblocktimer--;
            }
            if (this.target.healblocktimer > 0){
                this.target.healblocktimer--;
            }


            if (this.target.elongatedhealwoundpower > 0 && this.healblocktimer == 0 && this.health >= Holdthisformeplayerwounds){
                this.health = Math.round((Holdthisformeplayerwounds + this.health)/2);
            }if (this.elongatedhealwoundpower > 0 && this.target.healblocktimer == 0  && this.target.health >= Holdthisformemonsterwounds){
                this.target.health = Math.round((Holdthisformemonsterwounds + this.target.health)/2);
            }


            if(this.target.delayedblasttimer > 0){
                this.target.delayedblasttimer++;
            }
            if(this.target.delayedblasttimer > 3 && (this.health > 0 && this.target.health > 0)){
                this.health = this.health - this.target.delayedblastpower;
                HoldthisformeplayerReflect = HoldthisformeplayerReflect - this.target.delayedblastpower;
                this.target.delayedblastpower = 0;
                this.target.delayedblasttimer = 0;
            }
            if(this.delayedblasttimer > 0){
                this.delayedblasttimer++;
            }
            if(this.delayedblasttimer > 3 && (this.health > 0 && this.target.health > 0)){
                this.target.health = this.target.health - this.delayedblastpower;
                HoldthisformemonsterReflect = HoldthisformemonsterReflect - this.delayedblastpower;
                this.delayedblastpower = 0;
                this.delayedblasttimer = 0;
            }

            if (this.target.elongatedwoundtimer == 0) {
                this.target.elongatedwoundpower = 0;
            }

            if (this.elongatedwoundtimer == 0) {
                this.elongatedwoundpower = 0;
            }

            if (this.elongatedhealwoundtimer == 0) {
                this.elongatedhealwoundpower = 0;
            }

            if (this.target.elongatedhealwoundtimer == 0) {
                this.target.elongatedhealwoundpower = 0;
            }



            if (this.target.elongatedhealwoundtimer > 0) {
                this.target.elongatedhealwoundtimer--;
                this.target.health = this.target.health - this.target.elongatedhealwoundpower;
                HoldthisformeplayerReflect = HoldthisformeplayerReflect - this.target.elongatedhealwoundpower;
            }

            if (this.elongatedhealwoundtimer > 0) {
                this.elongatedhealwoundtimer--;
                this.health = this.health - this.elongatedhealwoundpower;
                HoldthisformemonsterReflect = HoldthisformemonsterReflect - this.elongatedhealwoundpower;
            }


            if (this.grouphealtimer > 0){
                this.grouphealtimer--;

            }

            if (this.target.grouphealtimer > 0){
                this.target.grouphealtimer--;

            }

            for(let k= 0; k<team.length; k++){
            if (team[k].grouphealtimer != 0){
                for(let t = 0; t<team.length; t++){
                    team[t].health += team[k].grouphealpower
                    if(team[t].health > team[t].maxhealth){
                        team[t].health = team[t].maxhealth
                    }
                }
            // for (let w = 0; w < MonsterStorageCounter; w++) {
            //     thisStorage[w].health = thisStorage[w].health + this.grouphealpower;

            //     if (thisStorage[w].health >= stats(monstlist( thisStorage[w].Idnum).health)) {
            //         thisStorage[w].health = stats(monstlist( thisStorage[w].Idnum).health);
            //       }
            //     }
            }
        }

            if (this.target.grouphealtimer != 0){
                    this.target.health = this.target.health + this.target.grouphealpower;

                    // if (this.target.health >= stats(monstlist( this.target.Idnum).health)) {
                    //     this.target.health = stats(monstlist( this.target.Idnum).health);
                    // }
                }


            if (this.grouphealtimer == 0){
                this.grouphealpower = 0;
            }

            if (this.target.grouphealtimer == 0){
                this.target.grouphealpowerA = 0;
            }


            /*
            for (int w = 0; w < MonsterStorageCounter; w++){
                thisStorage[w].health = thisStorage[w].health + this.grouphealpower;

                if (thisStorage[w].health >= stats(monstlist(thisStorage[w].Idnum).health)){
                    thisStorage[w].health = stats(monstlist(thisStorage[w].Idnum).health);
                }
                build attacker storage first.
            }*/



            if (this.elongatedwoundtimer > 0) {
                this.elongatedwoundtimer--;
                this.health = this.health - this.elongatedwoundpower;
                HoldthisformeplayerReflect = HoldthisformeplayerReflect - this.elongatedwoundpower;
            }

            if (this.target.elongatedwoundtimer > 0) {
                this.target.elongatedwoundtimer--;
                this.target.health = this.target.health - this.target.elongatedwoundpower;
                HoldthisformemonsterReflect = HoldthisformemonsterReflect - this.target.elongatedwoundpower;
            }
            let passreflectplayer = (HoldthisformeplayerReflectx - HoldthisformeplayerReflect);
            this.target.Reflect(passreflectplayer);


            let passreflectattacker = (HoldthisformemonsterReflectx - HoldthisformemonsterReflect);
            this.Reflect(passreflectattacker);

            if(this.reflecttimer > 0) {
                this.reflecttimer--;
            }
            if(this.target.reflecttimer > 0) {
                this.target.reflecttimer--;
            }

            if (this.target.reflecttimer == 0){
                this.target.reflectratio = 0;

            }
            if (this.reflecttimer == 0){
                this.reflectratio = 0;

            }

            
            if(this.protectstatstimer > 0){
                this.revertStats(thisClone)
            }
            if(this.target.protectstatstimer > 0){
                this.revertStats(thatClone)
            }

            StatAbuseCurb(this);
            StatAbuseCurb(this.target);



       }

    }
    revertStats(to){
        this.attack = to.attack
        this.defense = to.defense
        this.speed = to.speed
        //console.log(to)
    }
    }

    class Rectangle {
        constructor(x, y, height, width, color) {
            this.x = x
            this.y = y
            this.height = height
            this.width = width
            this.color = color
            this.xmom = 0
            this.ymom = 0
        }
        draw(){
            tutorial_canvas_context.fillStyle = this.color
            tutorial_canvas_context.fillRect(this.x, this.y, this.width, this.height)
        }
        move(){
            this.x+=this.xmom
            this.y+=this.ymom
        }
        isPointInside(point){
            if(point.x >= this.x){
                if(point.y >= this.y){
                    if(point.x <= this.x+this.width){
                        if(point.y <= this.y+this.height){
                        return true
                        }
                    }
                }
            }
            return false
        }
    }
    class Circle{
        constructor(x, y, radius, color, xmom = 0, ymom = 0){
            this.x = x
            this.y = y
            this.radius = radius
            this.color = color
            this.xmom = xmom
            this.ymom = ymom
        }       
         draw(){
            tutorial_canvas_context.lineWidth = 1

            tutorial_canvas_context.strokeStyle = this.color
            tutorial_canvas_context.beginPath();
            tutorial_canvas_context.arc(this.x, this.y, this.radius, 0, (Math.PI*2), true)
            tutorial_canvas_context.fillStyle = this.color
           tutorial_canvas_context.fill()
            tutorial_canvas_context.stroke(); 
        }
        move(){


            this.x += this.xmom
            this.y += this.ymom

        }


    }



function letersects(circle, left) {
    let areaX = left.x - circle.x;
    let areaY = left.y - circle.y;
    return areaX * areaX + areaY * areaY <= circle.radius * circle.radius*1.41;
}
function getRandomLightColor() {
    let letters = '0123456789ABCDEF';
    let color = '#';
    for (let i = 0; i < 6; i++) {
      color += letters[Math.floor(Math.random() * 16)];
    }
    return color;
  }



function squarecircle(square, circle){

    let squareendh = square.y + square.height
    let squareendw = square.x + square.width

    if(square.x <= circle.x){
        if(square.y <= circle.y){
            if(squareendw >= circle.x){
                if(squareendh >= circle.y){
                    return true
                }
            }
        }
    }
    return false
}



function srcnames(idnumber){
    //////console.log(idnumber)


    if (idnumber > -1) {
        switch (idnumber) {

            case 0:
                return "errantnope";
            case 1:
                return "kunk";
            case 2:
                return "kohboh";
            case 3:
                return "djoper";
            case 4:
                return "schorp";
            case 5:
                return "zaume";
            case 6:
                return "nhainhai";
            case 7:
                return "degeissdt";
            case 8:
                return "yuggle";
            case 9:
                return "bongu";
            case 10:
                return "giteriglia";
            case 11:
                return "cyosteroth";
            case 12:
                return "nentopode";
            case 13:
                return "centiclaka";
            case 14:
                return "uggnawb";
            case 15:
                return "grobhost";
            case 16:
                return "illelonab";
            case 17:
                return "rongzeed";
            case 18:
                return "blattle";
            case 19:
                return "swogharnler";
            case 20:
                return "adenolish";
            case 21:
                if(Math.random()<.5){
                    return "genaupresangb";
                }
                return "genaupresangc";
            case 22:
                return "daahnida";
            case 23:
                return "Sorba";
            case 24:
                return "Jiyou";
            case 25:
                return "Sparvae";
            case 26:
                return "Vellup";
            case 27:
                return "Bellaja";
            case 28:
                return "Levdzell";
            case 29:
                return "Rytegg";
            case 30:
                return "flashmer";
            case 31:
                return "schmodozer";
            case 32:
                return "octgotot";
            case 33:
                return "triaural";
            case 34:
                return "dicyto";
            case 35:
                return "monopteryx";
            case 36:
                return "errantnope";
            case 37:
                return "toobapath";
            case 38:
                return "wheeliosbop";
            case 39:
                return "Ihmpdrap";
            case 40:
                return "Epibazang";
            case 41:
                return "Hemtan";
            case 42:
                return "Ogo";
            case 43:
                return "Strachid";
            case 44:
                return "Toximastica";
            case 45:
                return "Urcuria";
            case 46:
                return "Hyuntress";
            case 47:
                return "Mondosplak";
            case 48:
                return "kaheksaguge";
            case 49:
                return "Sapiosuant";
            case 50:
                return "Munegull";
            case 51:
                return "Sudakleez";
            case 52:
                return "Halocordate";
            case 53:
                return "faydendron";
            case 54:
                return "Osteoplang";
            case 55:
                return "zrachnid";
            case 56:
                return "xlitch";
            case 57:
                return "baa";
            case 58:
                return "mantidile";
            case 59:
                return "nokoyl";
            case 60:
                return "yallod";
            case 61:
                return "algaetizer";
            case 62:
                return "kachort";
            case 63:
                return "slamelion";
            case 64:
                return "ayateda";
            case 65:
                return "wochem";
            case 66:
                return "humun";
            case 67:
                return "psychobath";
            case 68:
                return "gytanic";
            case 69:
                return "beis";
            case 70:
                return "Gungholio";
            case 71:
                return "honigkonig";
            case 72:
                return "Kungulpa";
            case 73:
                return "satinella";
            case 74:
                return "elocurl";
            case 75:
                return "takobie";
            case 76:
                return "obchovy";
            case 77:
                return "Nimnamnom";
            case 78:
                return "Tutewtoo";
            case 79:
                return "Blanqast";
            case 80:
                return "Indeo";
            case 81:
                return "Deblobbio";
            case 82:
                return "Knightstacean";
            case 83:
                return "Prostrax";
            case 84:
                return "Haptozahen";
            case 85:
                return "Minkohabod";
            case 86:
                return "Zeen";
            case 87:
                return "Tacroach";
            case 88:
                return "Manterfly";
            case 89:
                return "Beary";
            case 90:
                return "Sluggernaut";
            case 91:
                return "errantnope"
            case 92:
                return "Memeek";
            case 93:
                return "Doughgnat";
            case 94:
                return "rattic";
            case 95:
                return "missleaneous";
            case 96:
                return "Runnybabbit";
            case 97:
                return "Zubgondrakter";
            case 98:
                return "Whumpuhmp";

            case 99:
                return "Mangoon";
            case 100:
                return "Scarbeque";
            case 101:
                return "Fwuffynumpkins";

            case 102:
                return "Dothog";
            case 103:
                return "Reefcake";
            case 104:
                return "Cheetza";
            case 105:
                return "Sortsand";
            case 106:
                return "chilldabeest";
            case 107:
                return "Communigator";
            case 108:
                return "mossboss";
            case 109:
                return "vamprey";
            case 110:
                return "parafox";
            case 111:
                return "rhischlosserous";  //Rhischlosserous
            case 112:
                return "Hykeyna";
            case 113:
                return "Tafantula";
            case 114:
                return "Farmot";
            case 115:
                return "Beeurchin";
            case 116:
                return "Flyinsoup";
            case 117:
                return "melancolli";
            case 118:
                return "scorphibian";
            case 119:
                return "geliphant";
            case 120:
                return "chimpansy";
            case 121:
                if(Math.random()<.5){
                    return "giveup";
                }
                return "giveupx";
            case 122:
                return "Avokaboom";
            case 123:
                return "Eggress";
            case 124:
                return "Zentapede";
            case 125:
                return "Probocetus";
            case 126:
                return "Tankgolin";
            case 127:
                return "Spiekgul";
            case 128:
                return "Mnemont";
            case 129:
                return "Banandroid";
            case 130:
                return "Pigin";

        }
    }else{
        return "error";
    }
    return "errantnope";

}



let Kunk = new Monster(kunkid, kunksp, kunkat, kunkde, kunkhe)
let Djoper = new Monster(djoperid, djopersp, djoperat, djoperde, djoperhe)
let Schorp = new Monster(schorpid, schorpsp, schorpat, schorpde, schorphe)
let Zaume = new Monster(zaumeid, zaumesp, zaumeat, zaumede, zaumehe)
let Nhainhai = new Monster(nhainhaiid, nhainhaisp, nhainhaiat, nhainhaide, nhainhaihe)
let Kohboh = new Monster(kohbohid, kohbohsp, kohbohat, kohbohde, kohbohhe)
let Degeissdt = new Monster(degeissdtid, degeissdtsp, degeissdtat, degeissdtde, degeissdthe)
let Yuggle = new Monster(yuggleid, yugglesp, yuggleat, yugglede, yugglehe)
let Bongu = new Monster(bonguid, bongusp, bonguat, bongude, bonguhe)
let Giteriglia = new Monster(giterigliaid, giterigliasp, giterigliaat, giterigliade, giterigliahe)
let Cyosteroth = new Monster(cyosterothid, cyosterothsp, cyosterothat, cyosterothde, cyosterothhe)
let Nentopode = new Monster(nentopodeid, nentopodesp, nentopodeat, nentopodede, nentopodehe)
let Centiclak = new Monster(centiclakid, centiclaksp, centiclakat, centiclakde, centiclakhe)
let Uggnawb = new Monster(uggnawbid, uggnawbsp, uggnawbat, uggnawbde, uggnawbhe)
let Grobhost = new Monster(grobhostid, grobhostsp, grobhostat, grobhostde, grobhosthe)
let Illelonab = new Monster(illelonabid, illelonabsp, illelonabat, illelonabde, illelonabhe)
let Rongzeed = new Monster(rongzeedid, rongzeedsp, rongzeedat, rongzeedde, rongzeedhe)
let Blattle = new Monster(blattleid, blattlesp, blattleat, blattlede, blattlehe)
let Swogharnler = new Monster(swogharnlerid, swogharnlersp, swogharnlerat, swogharnlerde, swogharnlerhe)
let Adenolish = new Monster(adenolishid, adenolishsp, adenolishat, adenolishde, adenolishhe)
let Genaupresang = new Monster(genaupresangid, genaupresangsp, genaupresangat, genaupresangde, genaupresanghe)
// let Daahnida = new Monster(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe, 0,4,0,2);
let Daahnida = new Monster(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe)
let Sorba = new Monster(sorbaid, sorbasp, sorbaat, sorbade, sorbahe)
let Jiyou = new Monster(jiyouid, jiyousp, jiyouat, jiyoude, jiyouhe)
let Sparvae = new Monster(sparvaeid, sparvaesp, sparvaeat, sparvaede, sparvaehe)
let Vellup = new Monster(vellupid, vellupsp, vellupat, vellupde, velluphe)
let Bellaja = new Monster(bellajaid, bellajasp, bellajaat, bellajade, bellajahe)
let Levdzell = new Monster(levdzellid, levdzellsp, levdzellat, levdzellde, levdzellhe)
let Rytegg = new Monster(ryteggid, ryteggsp, ryteggat, ryteggde, rytegghe)
let Flashmer = new Monster(flashmerid, flashmersp, flashmerat, flashmerde, flashmerhe)
let Schmodozer = new Monster(schmodozerid, schmodozersp, schmodozerat, schmodozerde, schmodozerhe)
let Octgotot = new Monster(octgototid, octgototsp, octgototat, octgototde, octgotothe)
let Triaural = new Monster(triauralid, triauralsp, triauralat, triauralde, triauralhe)
let Dicyto = new Monster(dicytoid, dicytosp, dicytoat, dicytode, dicytohe)
let Monopteryx = new Monster(monopteryxid, monopteryxsp, monopteryxat, monopteryxde, monopteryxhe)
let Elastocark = new Monster(elastocarkid, elastocarksp, elastocarkat, elastocarkde, elastocarkhe)
let Toobapath = new Monster(toobapathid, toobapathsp, toobapathat, toobapathde, toobapathhe)
let Weeliosbop = new Monster(weeliosbopid, weeliosbopsp, weeliosbopat, weeliosbopde, weeliosbophe)
let Ihmpdrap = new Monster(ihmpdrapid, ihmpdrapsp, ihmpdrapat, ihmpdrapde, ihmpdraphe)
let Epibazang = new Monster(epibazangid, epibazangsp, epibazangat, epibazangde, epibazanghe)
let Hemtan = new Monster(hemtanid, hemtansp, hemtanat, hemtande, hemtanhe)
let Ogo = new Monster(ogoid, ogosp, ogoat, ogode, ogohe)
let Strachid = new Monster(strachidid, strachidsp, strachidat, strachidde, strachidhe)
let Toximastica = new Monster(toximasticaid, toximasticasp, toximasticaat, toximasticade, toximasticahe)
let Urcuria = new Monster(urcuriaid, urcuriasp, urcuriaat, urcuriade, urcuriahe)
let Hyuntress = new Monster(hyuntressid, hyuntresssp, hyuntressat, hyuntressde, hyuntresshe)
let Mondosplak = new Monster(mondosplakid, mondosplaksp, mondosplakat, mondosplakde, mondosplakhe)
let Kaheksaguge = new Monster(kaheksagugeid, kaheksagugesp, kaheksagugeat, kaheksagugede, kaheksagugehe)
let Sapiosuant = new Monster(sapiosuantid, sapiosuantsp, sapiosuantat, sapiosuantde, sapiosuanthe)
let Munegull = new Monster(munegullid, munegullsp, munegullat, munegullde, munegullhe)
let Sudakleez = new Monster(sudakleezid, sudakleezsp, sudakleezat, sudakleezde, sudakleezhe)
let Halocordate = new Monster(halocordateid, halocordatesp, halocordateat, halocordatede, halocordatehe)
let Fadendron = new Monster(fadendronid, fadendronsp, fadendronat, fadendronde, fadendronhe)
let Osteoplang = new Monster(osteoplangid, osteoplangsp, osteoplangat, osteoplangde, osteoplanghe)
let Zrachnid = new Monster(zrachnidid, zrachnidsp, zrachnidat, zrachnidde, zrachnidhe)
let Xlitch = new Monster(xlitchid, xlitchsp, xlitchat, xlitchde, xlitchhe)
let Baa = new Monster(baaid, baasp, baaat, baade, baahe)
let Mantidile = new Monster(mantidileid, mantidilesp, mantidileat, mantidilede, mantidilehe)
let Nokoyl = new Monster(nokoylid, nokoylsp, nokoylat, nokoylde, nokoylhe)
let Yallod = new Monster(yallodid, yallodsp, yallodat, yallodde, yallodhe)
let Algaetizer = new Monster(algaetizerid, algaetizersp, algaetizerat, algaetizerde, algaetizerhe)
let Kachort = new Monster(kachortid, kachortsp, kachortat, kachortde, kachorthe)
let Slamelion = new Monster(slamelionid, slamelionsp, slamelionat, slamelionde, slamelionhe)
let Ayateda = new Monster(ayatedaid, ayatedasp, ayatedaat, ayatedade, ayatedahe)
let Wochem = new Monster(wochemid, wochemsp, wochemat, wochemde, wochemhe)
let Humun = new Monster(humunid, humunsp, humunat, humunde, humunhe)
let Psykobath = new Monster(ψkobathid, ψkobathsp, ψkobathat, ψkobathde, ψkobathhe)
let Gytanic = new Monster(gytanicid, gytanicsp, gytanicat, gytanicde, gytaniche)
let Beis = new Monster(beisid, beissp, beisat, beisde, beishe)
let Gungholio = new Monster(gungholioid, gungholiosp, gungholioat, gungholiode, gungholiohe)
let Honigkonig = new Monster(honigkonigid, honigkonigsp, honigkonigat, honigkonigde, honigkonighe)
let Kungulp = new Monster(kungulpid, kungulpsp, kungulpat, kungulpde, kungulphe)
let Satinella = new Monster(σatinellaid, σatinellasp, σatinellaat, σatinellade, σatinellahe)
let Elocurl = new Monster(elocurlid, elocurlsp, elocurlat, elocurlde, elocurlhe)
let Takobie = new Monster(takobieid, takobiesp, takobieat, takobiede, takobiehe)
let Obchovy = new Monster(obchovyid, obchovysp, obchovyat, obchovyde, obchovyhe)
let Nimnamnom = new Monster(nimnamnomid, nimnamnomsp, nimnamnomat, nimnamnomde, nimnamnomhe)
let Tutewtoo = new Monster(tutewtooid, tutewtoosp, tutewtooat, tutewtoode, tutewtoohe)
let Blanqast = new Monster(blanqastid, blanqastsp, blanqastat, blanqastde, blanqasthe)
let Indeo = new Monster(indeoid, indeosp, indeoat, indeode, indeohe)
let Deblobbio = new Monster(deblobbioid, deblobbiosp, deblobbioat, deblobbiode, deblobbiohe)
let Knightstacean = new Monster(knightstaceanid, knightstaceansp, knightstaceanat, knightstaceande, knightstaceanhe)
let Prostrax = new Monster(prostraxid, prostraxsp, prostraxat, prostraxde, prostraxhe)
let Haptozahen = new Monster(haptozahenid, haptozahensp, haptozahenat, haptozahende, haptozahenhe)
let Minkohabod = new Monster(minkohabodid, minkohabodsp, minkohabodat, minkohabodde, minkohabodhe)
let Zeen = new Monster(zeenid, zeensp, zeenat, zeende, zeenhe)
let Tacroach = new Monster(tacroachid, tacroachsp, tacroachat, tacroachde, tacroachhe)
let Manterfly = new Monster(manterflyid, manterflysp, manterflyat, manterflyde, manterflyhe)
let Beary = new Monster(bearyid, bearysp, bearyat, bearyde, bearyhe)
let Sluggernaut = new Monster(sluggernautid, sluggernautsp, sluggernautat, sluggernautde, sluggernauthe)
let Custom = new Monster(91, 51, 51, 51, 51)
let Memeek = new Monster(memeekid, memeeksp, memeekat, memeekde, memeekhe)
let Doughgnat = new Monster(doughgnatid, doughgnatsp, doughgnatat, doughgnatde, doughgnathe)
let Rattic = new Monster(ratticid, ratticsp, ratticat, ratticde, rattiche)
let Missileaneous = new Monster(missileaneousid, missileaneoussp, missileaneousat, missileaneousde, missileaneoushe)
let Runnybabbit = new Monster(runnybabbitid, runnybabbitsp, runnybabbitat, runnybabbitde, runnybabbithe)
let Zubgondrakter = new Monster(zubgondrakterid, zubgondraktersp, zubgondrakterat, zubgondrakterde, zubgondrakterhe)
let Whumpuhmp = new Monster(whumpuhmpid, whumpuhmpsp, whumpuhmpat, whumpuhmpde, whumpuhmphe)
let Mangoon = new Monster(mangoonid, mangoonsp, mangoonat, mangoonde, mangoonhe)
let Scarbeque = new Monster(scarbequeid, scarbequesp, scarbequeat, scarbequede, scarbequehe)
let Fwuffynumpkins = new Monster(fwuffynumpkinsid, fwuffynumpkinssp, fwuffynumpkinsat, fwuffynumpkinsde, fwuffynumpkinshe)
let Dothog = new Monster(dothogid, dothogsp, dothogat, dothogde, dothoghe)
let Reefcake = new Monster(reefcakeid, reefcakesp, reefcakeat, reefcakede, reefcakehe)
let Cheetza = new Monster(cheetzaid, cheetzasp, cheetzaat, cheetzade, cheetzahe)
let Sortsand = new Monster(sortsandid, sortsandsp, sortsandat, sortsandde, sortsandhe)
let Chilldebeest = new Monster(chilldebeestid, chilldebeestsp, chilldebeestat, chilldebeestde, chilldebeesthe)
let Communigator = new Monster(communigatorid, communigatorsp, communigatorat, communigatorde, communigatorhe)
let Bossmoss = new Monster(mossbossid, mossbosssp, mossbossat, mossbossde, mossbosshe)
let Vamprey = new Monster(vampreyid, vampreysp, vampreyat, vampreyde, vampreyhe)
let Parafoxical = new Monster(parafoxid, parafoxsp, parafoxat, parafoxde, parafoxhe)
let Rhischlosserous = new Monster(rhischlosserousid, rhischlosseroussp, rhischlosserousat, rhischlosserousde, rhischlosseroushe)
let Hykeyna = new Monster(hykeynaid, hykeynasp, hykeynaat, hykeynade, hykeynahe)
let Tafantula = new Monster(tafantulaid, tafantulasp, tafantulaat, tafantulade, tafantulahe)
let Farmot = new Monster(farmotid, farmotsp, farmotat, farmotde, farmothe)
let Beeurchin = new Monster(beeurchinid, beeurchinsp, beeurchinat, beeurchinde, beeurchinhe)
let Flysoup = new Monster(flyinsoupid, flyinsoupsp, flyinsoupat, flyinsoupde, flyinsouphe)
let Meloncollie = new Monster(meloncollieid, meloncolliesp, meloncollieat, meloncolliede, meloncolliehe)
let Scorphibian = new Monster(scorphibianid, scorphibiansp, scorphibianat, scorphibiande, scorphibianhe)
let Geliphant = new Monster(geliphantid, geliphantsp, geliphantat, geliphantde, geliphanthe)
let Chimpansy = new Monster(chimpansyid, chimpansysp, chimpansyat, chimpansyde, chimpansyhe)
let Xaltoxis = new Monster(xaltoxisid, xaltoxissp, xaltoxisat, xaltoxisde, xaltoxishe)
let Avokaboom = new Monster(avokaboomid, avokaboomsp, avokaboomat, avokaboomde, avokaboomhe)
let Eggress = new Monster(eggressid, eggresssp, eggressat, eggressde, eggresshe)
let Zentapede = new Monster(zentapedeid, zentapedesp, zentapedeat, zentapedede, zentapedehe)
let Probocetus = new Monster(probocetusid, probocetussp, probocetusat, probocetusde, probocetushe)
let Tankgolin = new Monster(tankgolinid, tankgolinsp, tankgolinat, tankgolinde, tankgolinhe)
let Spiekgul = new Monster(spiekgulid, spiekgulsp, spiekgulat, spiekgulde, spiekgulhe)
let Mnemont = new Monster(mnemontid, mnemontsp, mnemontat, mnemontde, mnemonthe)
let Banandroid = new Monster(banandroidid, banandroidsp, banandroidat, banandroidde, banandroidhe)
let Pigin = new Monster(piginid, piginsp, piginat, piginde, piginhe)
let error = new Monster(0, 51, 51, 51, 753)



function monstlist( idnumber){

    switch (idnumber) {

        case 0:
            return error.clone();
        case 1:
            return Kunk.clone();
        case 2:
            return Kohboh.clone();
        case 3:
            return Djoper.clone();
        case 4:
            return Schorp.clone();
        case 5:
            return Zaume.clone();
        case 6:
            return Nhainhai.clone();
        case 7:
            return Degeissdt.clone();
        case 8:
            return Yuggle.clone();
        case 9:
            return Bongu.clone();
        case 10:
            return Giteriglia.clone();
        case 11:
            return Cyosteroth.clone();
        case 12:
            return Nentopode.clone();
        case 13:
            return Centiclak.clone();
        case 14:
            return Uggnawb.clone();
        case 15:
            return Grobhost.clone();
        case 16:
            return Illelonab.clone();
        case 17:
            return Rongzeed.clone();
        case 18:
            return Blattle.clone();
        case 19:
            return Swogharnler.clone();
        case 20:
            return Adenolish.clone();
        case 21:
            return Genaupresang.clone();
        case 22:
            return Daahnida.clone();
        case 23:
            return Sorba.clone();
        case 24:
            return Jiyou.clone();
        case 25:
            return Sparvae.clone();
        case 26:
            return Vellup.clone();
        case 27:
            return Bellaja.clone();
        case 28:
            return Levdzell.clone();
        case 29:
            return Rytegg.clone();
        case 30:
            return Flashmer.clone();
        case 31:
            return Schmodozer.clone();
        case 32:
            return Octgotot.clone();
        case 33:
            return Triaural.clone();
        case 34:
            return Dicyto.clone();
        case 35:
            return Monopteryx.clone();
        case 36:
            return Elastocark.clone();
        case 37:
            return Toobapath.clone();
        case 38:
            return Weeliosbop.clone();
        case 39:
            return Ihmpdrap.clone();
        case 40:
            return Epibazang.clone();
        case 41:
            return Hemtan.clone();
        case 42:
            return Ogo.clone();
        case 43:
            return Strachid.clone();
        case 44:
            return Toximastica.clone();
        case 45:
            return Urcuria.clone();
        case 46:
            return Hyuntress.clone();
        case 47:
            return Mondosplak.clone();
        case 48:
            return Kaheksaguge.clone();
        case 49:
            return Sapiosuant.clone();
        case 50:
            return Munegull.clone();
        case 51:
            return Sudakleez.clone();
        case 52:
            return Halocordate.clone();
        case 53:
            return Fadendron.clone();
        case 54:
            return Osteoplang.clone();
        case 55:
            return Zrachnid.clone();
        case 56:
            return Xlitch.clone();
        case 57:
            return Baa.clone();
        case 58:
            return Mantidile.clone();
        case 59:
            return Nokoyl.clone();
        case 60:
            return Yallod.clone();
        case 61:
            return Algaetizer.clone();
        case 62:
            return Kachort.clone();
        case 63:
            return Slamelion.clone();
        case 64:
            return Ayateda.clone();
        case 65:
            return Wochem.clone();
        case 66:
            return Humun.clone();
        case 67:
            return Psykobath.clone();
        case 68:
            return Gytanic.clone();
        case 69:
            return Beis.clone();
        case 70:
            return Gungholio.clone();
        case 71:
            return Honigkonig.clone();
        case 72:
            return Kungulp.clone();
        case 73:
            return Satinella.clone();
        case 74:
            return Elocurl.clone();
        case 75:
            return Takobie.clone();
        case 76:
            return Obchovy.clone();
        case 77:
            return Nimnamnom.clone();
        case 78:
            return Tutewtoo.clone();
        case 79:
            return Blanqast.clone();
        case 80:
            return Indeo.clone();
        case 81:
            return Deblobbio.clone();
        case 82:
            return Knightstacean.clone();
        case 83:
            return Prostrax.clone();
        case 84:
            return Haptozahen.clone();
        case 85:
            return Minkohabod.clone();
        case 86:
            return Zeen.clone();
        case 87:
            return Tacroach.clone();
        case 88:
            return Manterfly.clone();
        case 89:
            return Beary.clone();
        case 90:
            return Sluggernaut.clone();
        case 91:
                return Custom.clone();
        case 92:

        return Memeek.clone();
        case 93:
            return Doughgnat.clone();
        case 94:
            return Rattic.clone();
        case 95:
            return Missileaneous.clone();
        case 96:
            return Runnybabbit.clone();
        case 97:
            return Zubgondrakter.clone();
        case 98:
            return Whumpuhmp.clone();
        case 99:
            return Mangoon.clone();
        case 100:
            return Scarbeque.clone();
        case 101:
            return Fwuffynumpkins.clone();
        case 102:
            return Dothog.clone();
        case 103:
            return Reefcake.clone();
        case 104:
            return Cheetza.clone();
        case 105:
            return Sortsand.clone();
        case 106:
            return Chilldebeest.clone();
        case 107:
            return Communigator.clone();
        case 108:
            return Bossmoss.clone();
        case 109:
            return Vamprey.clone();
        case 110:
            return Parafoxical.clone();
        case 111:
            return Rhischlosserous.clone();
        case 112:
            return Hykeyna.clone();
        case 113:
            return Tafantula.clone();
        case 114:
            return Farmot.clone();
        case 115:
            return Beeurchin.clone();
        case 116:
            return Flysoup.clone();
        case 117:
            return Meloncollie.clone();
        case 118:
            return Scorphibian.clone();
        case 119:
            return Geliphant.clone();
        case 120:
            return Chimpansy.clone();
        case 121:
            return Xaltoxis.clone();
        case 122:
            return Avokaboom.clone();
        case 123:
            return Eggress.clone();
        case 124:
            return Zentapede.clone();
        case 125:
            return Probocetus.clone();
        case 126:
            return Tankgolin.clone();
        case 127:
            return Spiekgul.clone();
        case 128:
            return Mnemont.clone();
        case 129:
            return Banandroid.clone();
        case 130:
            return Pigin.clone();
    }
    return error.clone();
}



function HealingMoveNames( move) {
    //Cases after 6 hypothetical
    switch (move){
        case 0:
            return "Heal";
        case 1:
            return "Delayed Heal";
        case 2:
            return "Heal Over Time";
        case 3:
            return "Life Glug";
        case 4:
            return "Cleansing Heal";
        case 5:
            return "All Team Heal";
        case 6:
            return "Snowballing";  // 90% as strong as regular heal, increases stats by 1%
        case 7:
            return "Momentum"; // +5% speed increase and half powered heal
        case 8:
            return "Posturing"; // +5% attack and attack/maxhealth based heal
        case 9:
            return "Growth";  // +5% defense and half power heal based on defense stat 1
        case 10:
            return "Delayed Big Snowball";  // let snowball after delay
    }
    return "HealError";
}

function SpecialMoveNames( move) {
    // 9 hypothetical
    switch (move){
        case 0:
            return "Wound";
        case 1:
            return "Delayed Blast";
        case 2:
            return "Grevious Wounds";
        case 3:
            return "Life Glug Over Time";
        case 4:
            return "Heal Block";
        case 5:
            return "Defense Chip";
        case 6:
            return "Trip";
        case 7:
            return "Discipline";
        case 8:
            return "Boost Block";
        case 9:
            return "Refute"; // Cleanse + damage ~ lifeglug or discipline
        case 10:
            return "Energy Burn"; // all stat 5% drop with damage based on stats/stats
        case 11:
            return "Depress"; // all stat 5% drop with damage based on stats/stats
        case 12:
            return "Snatch";
        case 13:
            return "Dispel";
        case 14:
            return "Stats Shield";
        case 15:
            return "Reflective Shield";
        case 16:
            return "Copy";
    }
    return "SpecialError";
}

function attackMoveNames( move) {
    // 9 hypothetical
    switch (move){
        case 0:
            return "Attack"; //at/def
        case 1:
            return "Advance"; // At/sp
        case 2:
            return "Overpower";  // attack/at
        case 3:
            return "Puncture"; //   Sp/def
        case 4:
            return "Race";//  sp/sp
        case 5:
            return "Exhaust";//  sp/at
        case 6:
            return "Collide";// def/.def
        case 7:
            return "Obstruct";// def/sp
        case 8:
            return "Block Beam";//  def/at
    }
    return "attackError";
}

function StatsMoveNames( move) {
    switch (move){
        case 0:
            return "All Stat Minor Boost ";
        case 1:
            return "Speed and defense Boost ";
        case 2:
            return "Attack and defense Boost ";
        case 3:
            return "Attack and speed Boost ";
        case 4:
            return "Major speed Boost ";
        case 5:
            return "Major defense Boost ";
        case 6:
            return "Major attack Boost ";
        case 7:
            return "Delayed All Stat Boost ";
        case 8:
            return "Delayed Major speed and defense Boost ";
        case 9:
            return "Delayed Major attack and defense Boost ";
        case 10:
            return "Delayed Major attack and speed Boost ";
        case 11:
            return "Delayed Huge speed Boost ";
        case 12:
            return "Delayed Huge defense boost ";
        case 13:
            return "Delayed Huge attack boost ";
        case 14:
            return "Speed Sap ";
        case 15:
            return "Defense Drain ";
        case 16:
            return "Attack Absorb ";
    }
    return "StatError";
}




let monster1 =  monstlist(Math.floor(Math.random()*131))
let monster2 = monstlist(Math.floor(Math.random()*131))//monstlist(19)//
monster1.target = monster2
let bar1 = new Rectangle(25, 505, 25,300,"#00FF00")
let bar2 = new Rectangle(25, 505, 25, 300,"#FF0000")
let bar1x = new Rectangle(877, 505, 25,300,"#00FF00")
let bar2x = new Rectangle(877, 505, 25, 300,"#FF0000")

let attackbutton = new Rectangle(410,100,50,50,"red")
let boostbutton = new Rectangle(410,400,50,50,"blue")
let healbutton = new Rectangle(410,200,50,50,"#00DD00")
let specialbutton = new Rectangle(410,300,50,50,"orange")



let swapup = new Rectangle(500,500,50,50,"cyan")
let swapdown = new Rectangle(580,500,50,50,"magenta")
let capture = new Rectangle ( 500 , 50, 200, 200, "#00FF00")

let attackbutton2 = new Rectangle(750,100,50,50,"red")
let boostbutton2= new Rectangle(750,400,50,50,"blue")
let healbutton2 = new Rectangle(750,200,50,50,"#00DD00")
let specialbutton2 = new Rectangle(750,300,50,50,"orange")
////console.log(team[selector])
////console.log(monster2)
let countertron = 0
let countertronx = 0



let selector = 0

let team = []

team.push(monster1)

team.push(monstlist(Math.floor(Math.random()*131)).clone())



monster2.target = team[selector]


for(let t =0;t<131;t++){

    team.push(monstlist(t).clone())
}


if(team[selector].speed > monster2.speed){
    team[selector].turn = 1
}


window.setInterval(function(){ 


    if(team[selector].health <0){
        team[selector].health = 0
    }
    if(monster2.health <0){
        monster2.health = 0
    }

    monster2.health=Math.round(monster2.health)
    team[selector].health=Math.round(team[selector].health)
    StatAbuseCurb(team[selector])
    StatAbuseCurb(monster2)

    tutorial_canvas_context.clearRect(0,0,tutorial_canvas.width*10000,tutorial_canvas.height*10000)
    

    if(monster2.health <= 0){
        capture.draw()
    }
            swapdown.draw()

        swapup.draw()
 
    
    if(team[selector].turn == 1){
        attackbutton.draw()
        boostbutton.draw()
        specialbutton.draw()
        healbutton.draw()
    }else{
        attackbutton2.draw()
        boostbutton2.draw()
        specialbutton2.draw()
        healbutton2.draw()
    }

    bar2x.draw()
    bar1x.draw()

    bar2.draw()
    bar1.draw()

    
    bar1.width =  (team[selector].health/team[selector].maxhealth)*300
    bar1x.width =  (monster2.health/monster2.maxhealth)*300


    // let canvasW = tutorial_canvas.width/2.5, canvasH = tutorial_canvas.height/2.5;
    // let imgW = img.naturalWidth || canvasW, imgH = img.naturalHeight || canvasH;

    // let ratio = canvasW/imgW;
    
    tutorial_canvas_context.scale(-1,1)
    tutorial_canvas_context.drawImage(monster2.img, -1212, 50, 404, 404);
    tutorial_canvas_context.scale(-1,1)
    tutorial_canvas_context.drawImage(team[selector].img, 0, 50, 404, 404);


    tutorial_canvas_context.font = `${18.5}px Arial`
    tutorial_canvas_context.fillStyle = "black";


    tutorial_canvas_context.fillText(`Health: ${team[selector].health}/${team[selector].maxhealth}`, 50, 570)
    tutorial_canvas_context.fillText(`attack: ${team[selector].attack}`, 50, 600)
    tutorial_canvas_context.fillText(`defense: ${team[selector].defense}`, 50, 630)
    tutorial_canvas_context.fillText(`speed: ${team[selector].speed}`, 50, 660)
    tutorial_canvas_context.fillText(` ${team[selector].akname}`, 200, 570)
    tutorial_canvas_context.fillText(` ${team[selector].dfname}`, 200, 630)
    tutorial_canvas_context.fillText(` ${team[selector].spname}`, 200, 660)
    tutorial_canvas_context.fillText(` ${team[selector].hpname}`, 200, 600)
    tutorial_canvas_context.fillText(`Health: ${monster2.health}/${monster2.maxhealth}`, 900, 570)
    tutorial_canvas_context.fillText(`attack: ${monster2.attack}`, 900, 600)
    tutorial_canvas_context.fillText(`defense: ${monster2.defense}`, 900, 630)
    tutorial_canvas_context.fillText(`speed: ${monster2.speed}`, 900, 660)
    tutorial_canvas_context.fillText(` ${monster2.akname}`, 1050, 570)
    tutorial_canvas_context.fillText(` ${monster2.dfname}`, 1050, 630)
    tutorial_canvas_context.fillText(` ${monster2.spname}`, 1050, 660)
    tutorial_canvas_context.fillText(` ${monster2.hpname}`, 1050, 600)

}, 20)

function StatAbuseCurb(raw){
    
    if (raw.attack >= 750){
        raw.attack = 750;
    }
    if (raw.speed >= 750){
        raw.speed = 750;
    }
    if (raw.defense >= 750){
        raw.defense = 750;
    }

    if (raw.attack <= statMinimum){
        raw.attack = statMinimum;
    }
    if (raw.speed <= statMinimum){
        raw.speed = statMinimum;
    }
    if (raw.defense <= statMinimum){
        raw.defense = statMinimum;
    }
    if (raw.health > raw.maxhealth){
        raw.health = raw.maxhealth
    }

}
})