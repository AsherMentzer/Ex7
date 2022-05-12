package fileSystem;

public class SizeCalculatorVisitor implements FileDetailsVisitor{
    int totalSize=0;
    public int getTotalSize(){return totalSize;};
    @Override
    public void visit(DirectoryDetails directoryDetails) {}

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        totalSize+=docxFileDetails.getSize();
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        totalSize+=htmlFileDetails.getSize();
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        totalSize+=jpgFileDetails.getSize();
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        totalSize+=mp3FileDetails.getSize();
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        totalSize+=pptxFileDetails.getSize();
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        totalSize+=txtFileDetails.getSize();
    }
}
