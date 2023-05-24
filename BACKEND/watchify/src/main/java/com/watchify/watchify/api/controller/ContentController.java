package com.watchify.watchify.api.controller;


import com.watchify.watchify.api.service.ContentService;
import com.watchify.watchify.api.service.MyContentService;
import com.watchify.watchify.api.service.UserService;
import com.watchify.watchify.dto.request.ContentLikeRequestDTO;
import com.watchify.watchify.dto.request.PkRequestDTO;
import com.watchify.watchify.dto.response.DefaultContentDTO;
import com.watchify.watchify.dto.response.HistoryDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/content")
@RequiredArgsConstructor
public class ContentController {

    private final UserService userService;
    private final MyContentService myContentService;
    private final ContentService contentService;
//

    @PutMapping("/wishswitch")
    public ResponseEntity<?> SwitchWishContent(HttpServletRequest request, @RequestBody PkRequestDTO pkRequestDTO) {
        String accessToken = request.getHeader("access");
        long userId = userService.findUserIdByAccessToken(accessToken);

        try {
            myContentService.switchWishContent(userId, pkRequestDTO.getPk());
            return ResponseEntity.status(200).body("Wish Content updated successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(404).body("Wish Content updated fail.");
        }

    }

    @PutMapping("/like")
    public ResponseEntity<?> UpdateContentLike(HttpServletRequest request, @RequestBody ContentLikeRequestDTO contentLikeRequestDTO) {
        String accessToken = request.getHeader("access");
        long userId = userService.findUserIdByAccessToken(accessToken);


        try {
            myContentService.updateContentLike(userId, contentLikeRequestDTO);
            return ResponseEntity.status(200).body("Content Like updated successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(404).body("Content Like updated fail.");
        }
    }
}
