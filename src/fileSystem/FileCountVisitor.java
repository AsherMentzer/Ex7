package fileSystem;

public class FileCountVisitor implements FileDetailsVisitor{
    int filesCount=0;
    public int getFilesCount(){return filesCount;};
    @Override
    public void visit(DirectoryDetails directoryDetails) {}

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        filesCount++;
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        filesCount++;
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        filesCount++;
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        filesCount++;
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        filesCount++;
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        filesCount++;
    }
}
