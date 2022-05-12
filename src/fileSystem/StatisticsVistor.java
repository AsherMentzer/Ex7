package fileSystem;

public class StatisticsVistor implements FileDetailsVisitor{
    @Override
    public void visit(DirectoryDetails directoryDetails) {
        FileCountVisitor fileCountVisitor=new FileCountVisitor();
        directoryDetails.accept(fileCountVisitor);
        System.out.println("Directory "+directoryDetails.getName()+
                " has "+fileCountVisitor.getFilesCount()+" files.");
    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        System.out.println("The file " + docxFileDetails.getName()+ " has an average of "
                +Math.round((float)docxFileDetails.getWords()/docxFileDetails.getPages())+" words per page.");
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        System.out.println("The file " + htmlFileDetails.getName()+ " contains "
                +htmlFileDetails.getLines()+" lines.");
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        System.out.println("The picture "+jpgFileDetails.getName()+" has an average of "+
               Math.round((float)jpgFileDetails.getSize()/(jpgFileDetails.getHeight()*jpgFileDetails.getWidth()))
                +" bytes per pixel.");
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        System.out.println("The bitrate of "+mp3FileDetails.getName() +" is "+
               Math.round((float)mp3FileDetails.getSize()/mp3FileDetails.getLengthSec())+" bytes per second.");
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        System.out.println("The average slide size in Presentation "+pptxFileDetails.getName()+
                " is "+Math.round((float)pptxFileDetails.getSize()/pptxFileDetails.getSlides())+".");
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        System.out.println("The file "+txtFileDetails.getName()+" contains "+
                txtFileDetails.getWords()+" words.");
    }
}
