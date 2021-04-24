public class Run2 {
    public static void main(String[] args) {

        Music m1 = new Music("Zemestoon","C:\\Users\\intel\\Music","Moghdam",1980);
        Music m2 = new Music("Delaram","C:\\Users\\intel\\Music","Macan Band",2016);
        Music m3 = new Music("Fanus","C:\\Users\\intel\\Downloads","Rostami",1978);

        MusicCollection myMusics = new MusicCollection();

        myMusics.addFile(m1);
        myMusics.addFile(m2);
        myMusics.addFile(m3);
        myMusics.addFile(m3);
        myMusics.addFile(m3);

        myMusics.addFavorite(m1);
        myMusics.addFavorite(m2);

        System.out.println("number of musics: "+myMusics.getNumberOfFiles());

        myMusics.listAllFiles();

        myMusics.listAllFavorite();

        myMusics.removeFile(2);
        System.out.println("list after removing 3rd music:");
        myMusics.listAllFiles();

        myMusics.search("C:\\Users\\intel\\Music");
        System.out.println();

        myMusics.startPlaying(1);
        myMusics.stopPlaying();
    }
}
