package com.rf.galaxy.model;

import java.util.ArrayList;

public class GalaxyData {

    public static String [][] data = new String[][] {

            {"Andromeda",
                    "220,000 light-years (67,000 pc)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Andromeda_Galaxy_%28with_h-alpha%29.jpg/280px-Andromeda_Galaxy_%28with_h-alpha%29.jpg",
                    "The well-known Andromeda Galaxy, also known as Messier 31, is a spiral galaxy and the nearest neighboring galaxy to the Milky Way. In 4.5 billion years, scientists believe that the Andromeda Galaxy and Milky Way Galaxy will collide, crashing together to form a new, giant elliptical galaxy. Although the Andromeda Galaxy contains around a trillion stars, it’s actually smaller than the Milky Way as result of containing less dark matter.",
                    "2.537 million light years",
                    "1764",
                    "Andromeda"},
            {"Tadpole",
                    "280,000 ly (86,000 pc)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/UGC_10214HST.jpg/300px-UGC_10214HST.jpg",
                    "Classified as a disrupted barred spiral galaxy, the Tadpole Galaxy stands apart from most of its counterparts. The unique tadpole-like shape that earned the galaxy its name is what makes it so unusual. Scientists believe that the Tadpole Galaxy got its unique shape from a prior collision with a smaller galaxy. The materials of the weaker galaxy have been absorbing into the Tadpole Galaxy, giving it the tail that makes it so notable.",
                    "400 million light years",
                    "1781",
                    "Draco"},
            {"ESO 444-46",
                    "402,200 ly (123.32 kpc)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/ESO_444-46.jpg/250px-ESO_444-46.jpg",
                    "ESO 444-46 shines as the brightest member of the galaxy cluster Abell 3558 which lies in the Shapely Supercluster, setting it apart as particularly beautiful from a distance. This elliptical galaxy also boasts an estimated population of about 27,000 globular clusters, which could establish it as possessing the largest population yet studied.",
                    "640 million light years",
                    "1834",
                    "Centaurus"},
            {"Condor",
                    "522 kly (160 kpc)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/NGC_6872.png/250px-NGC_6872.png",
                    "This giant barred spiral galaxy, also known as the Condor Galaxy, is the largest known spiral galaxy in the observable universe. It owes much of its attributed size to the long, distinct arms that inspired its name. NGC 6872 is located in the southern constellation Pavo, the Peacock. The notable elongated shape of this beautiful galaxy is thought to be a result of its ongoing collision with the smaller galaxy IC 4970.",
                    "212 million light years",
                    "1835",
                    "Pavo"},
            {"Comet",
                    "600,000 ly (180,000 pc)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/CometGalaxy.jpg/250px-CometGalaxy.jpg",
                    "This impressive spiral galaxy stands apart from its neighbors as a result of its distinctive blue knots and wisps of young stars that trail in its wake and give the Comet Galaxy its name. These unusual features are thought to be caused by the gravitational pull of another galaxy cluster. Gravitational pull like this can starve a galaxy for the gas needed to create new stars and cause sever shrinking over time.",
                    "3.2 billion light years",
                    "2007",
                    "Sculptor"},
            {"UGC 2885",
                    "832 kly (255 kpc)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/UGC_2885.tif/lossy-page1-300px-UGC_2885.tif.jpg",
                    "While certainly impressive in size, the unbarred spiral galaxy UGC 2885 displays relatively low surface brightness. It’s so faint, in fact, that its arms can only be observed via long exposure in infrared wavelengths. As a result, its center giant nucleus is this galaxy’s most outstanding feature.",
                    "313 million light years",
                    "2002",
                    "Perseus"},
            {"ESO 306-17",
                    "1,000,000 ly (310,000 pc)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/ESO_306-17.jpg/200px-ESO_306-17.jpg",
                    "ESO 306-17 is classified as a fossil group giant elliptical galaxy, and sits in a noticeably empty section of space. Scientists believe that this conspicuously empty space surrounding the galaxy indicates that ESO 306-17 absorbed all of its neighboring galaxies years ago, thus earning it the classification of a fossil group.",
                    "0.5 billion light years",
                    "1826",
                    "Columba"},
            {"A2261-BCG",
                    "1,000,000 ly (310,000 pc)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Galaxy_Cluster_Abell_2261.jpg/220px-Galaxy_Cluster_Abell_2261.jpg",
                    "A2261-BCG is the largest and and brightest of all galaxies within the Abell 2261 galaxy cluster. In addition to its impressive size, this galaxy stands out as having the most massive galaxy core ever observed. The core of A2261-BCG is also distinctly different in appearance from the center of most galaxies, lacking the characteristic bright ring surrounding a black hole.",
                    "3 billion light years",
                    "2011",
                    "Hercules"},
            {"Hercules A",
                    "1,500,000 ly (460,000 pc)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/A_Multi-Wavelength_View_of_Radio_Galaxy_Hercules_A.jpg/220px-A_Multi-Wavelength_View_of_Radio_Galaxy_Hercules_A.jpg",
                    "Known for being the brightest radio-emitting object in the constellation Hercules, 3C 348 (Hercules A) emits almost a billion times more power in radio wavelengths than our Sun! The formation of Hercules A is unique in shape, sporting two cosmic jets that extend from its center. These jets are invisible to the human eye and have been detected via radio signal.",
                    "2.1 billion light years",
                    "1714",
                    "Hercules"},
            {"IC 1101",
                    "4,000,000 ly (1,200,000 pc)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/IC_1101_in_Abell_2029_%28hst_06228_03_wfpc2_f702w_pc%29.jpg/275px-IC_1101_in_Abell_2029_%28hst_06228_03_wfpc2_f702w_pc%29.jpg",
                    "IC 1101 is the largest galaxy in the observable universe. This supergiant elliptical galaxy is estimated to be around 2000 times larger than our Milky Way Galaxy, and also sports the largest known supermassive black hole known to man. This awe-inspiring black hole is likely what generates the bright radio signal emitted from the galaxy’s center.",
                    "1.045 billion light years",
                    "1790",
                    "Virgo"}

    };

    public static ArrayList<Galaxy> getListData() {
        Galaxy galaxy;
        ArrayList<Galaxy> list = new ArrayList<>();

        for (String[] mData : data) {
            galaxy = new Galaxy();
            galaxy.setName(mData[0]);
            galaxy.setScale(mData[1]);
            galaxy.setPhoto(mData[2]);
            galaxy.setDescrption(mData[3]);
            galaxy.setDistance(mData[4]);
            galaxy.setYear(mData[5]);
            galaxy.setCons(mData[6]);

            list.add(galaxy);
        }

        return list;
    }

}
