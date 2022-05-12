package fileSystem;

public interface FileDetailsVisitor {
    void visit(DirectoryDetails directoryDetails);
    void visit(DocxFileDetails docxFileDetails);
    void visit(HtmlFileDetails htmlFileDetails);
    void visit(JpgFileDetails jpgFileDetails);
    void visit(Mp3FileDetails mp3FileDetails);
    void visit(PptxFileDetails pptxFileDetails);
    void visit(TxtFileDetails txtFileDetails);
}
