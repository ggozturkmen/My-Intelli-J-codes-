package Class23;

public class HM1 {

    //Create a class File that will have the following behaviors: open, edit, close.
    // Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    // Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
}
     abstract class file {
    abstract void open();

    void edit() {
        System.out.println("Editing the file");
    }
    void close(){
            System.out.println("closing the file");
        }
    }
    class JavaFile extends file{

        @Override
        void open() {
            System.out.println("to open .java file we need notepad++ or sublime text");
        }

    }
    class WordFile extends file{

        @Override
        void open() {
            System.out.println("to open .Wordfile we need to upload wordFile");
        }
    }
    class pdfFile extends file{

        @Override
        void open() {
            System.out.println("to open .pdfFile we need Microsoft word to be installed");
        }
    }
    class fileTester {
        public static void main(String[] args) {
            file[] file = {new JavaFile(), new WordFile(), new pdfFile()};
            for (file Files : file) {
                Files.open();
            }
        }

    }
