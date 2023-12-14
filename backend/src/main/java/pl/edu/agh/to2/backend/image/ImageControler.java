package pl.edu.agh.to2.backend.image;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.agh.to2.backend.thumbnail.ThumbnailService;

import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageControler {
    private ImageService imageService;


    public ImageControler(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("/post_image")
    public ResponseEntity sendImage(@RequestBody String image) {
        imageService.addNewImage(image);
        return ResponseEntity.ok(HttpStatus.ACCEPTED);
    }
}

