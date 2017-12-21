package yazdaniscodelab.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class PdfViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);

        PDFView pdfView=(PDFView)findViewById(R.id.pdfView);

        pdfView.fromAsset("myfile.pdf")
                .spacing(3)
                .pageFitPolicy(FitPolicy.BOTH)
                .load();
    }
}
