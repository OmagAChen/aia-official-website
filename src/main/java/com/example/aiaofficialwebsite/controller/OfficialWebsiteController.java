package com.example.aiaofficialwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

@Controller
public class OfficialWebsiteController {

    @RequestMapping("/")
    public String officialWeb() {
        return "main_page";
    }

    @RequestMapping("/main_page.html")
    public String mainWeb() {
        return "main_page.html";
    }

    @RequestMapping("/2021_ai_art_exhibition.html")
    public String aiArtExhibition2021() {
        return "2021_ai_art_exhibition.html";
    }

    @RequestMapping("/2020_ai_art_exhibition.html")
    public String aiArtExhibition2020() {
        return "2020_ai_art_exhibition.html";
    }

    @RequestMapping("/2017_ai_art_exhibition.html")
    public String aiArtExhibition2017() {
        return "2017_ai_art_exhibition.html";
    }

    @RequestMapping("/about.html")
    public String aboutWeb() {
        return "about.html";
    }

    @RequestMapping("/ai_art-tech-poetry&painting.html")
    public String poetryWeb(Model model) {
        String[] filePathAry = getFilePathAry("/assets/images/作品/詩畫_poetry&painting/");
        model.addAttribute("filePathAry", filePathAry);
        return "ai_art-tech-poetry&painting.html";
    }

    @RequestMapping("/ai_art_tech-big_data.html")
    public String bigDataWeb() {
        return "ai_art_tech-big_data.html";
    }

    @RequestMapping("/ai_art_tech-cat'sEye.html")
    public String catsEyeWeb(Model model) {
        String[] filePathAry = getFilePathAry("/assets/images/作品/貓眼_cat'sEye/");
        model.addAttribute("filePathAry", filePathAry);
        return "ai_art_tech-cat'sEye.html";
    }

    @RequestMapping("/ai_art_tech-dancer.html")
    public String dancerWeb() {
        return "ai_art_tech-dancer.html";
    }

    @RequestMapping("/ai_art_tech-digitalBlueAndWhitePorcelain.html")
    public String digitalBlueAndWhitePorcelainWeb(Model model) {
        String[] filePathAry = getFilePathAry("/assets/images/作品/數字青花_digitalBlueAndWhitePorcelain/");
        model.addAttribute("filePathAry", filePathAry);
        return "ai_art_tech-digitalBlueAndWhitePorcelain.html";
    }

    @RequestMapping("/ai_art_tech-emotionalMirror.html")
    public String emotionalMirrorWeb() {
        return "ai_art_tech-emotionalMirror.html";
    }

    @RequestMapping("/ai_art_tech-fusion.html")
    public String fusionWeb(Model model) {
        String[] filePathAry = getFilePathAry("/assets/images/作品/融合_fusion/");
        model.addAttribute("filePathAry", filePathAry);
        return "ai_art_tech-fusion.html";
    }

    @RequestMapping("/ai_art_tech-landscapeAI.html")
    public String landscapeAiWeb() {
        return "ai_art_tech-landscapeAI.html";
    }

    @RequestMapping("/ai_art_tech-LineArtPortrait.html")
    public String lineArtPortraitWeb() {
        return "ai_art_tech-LineArtPortrait.html";
    }

    @RequestMapping("/ai_art_tech-painter.html")
    public String painterWeb(Model model) {
        String[] filePathAry = getFilePathAry("/assets/images/作品/畫師_painter/");
        model.addAttribute("filePathAry", filePathAry);
        return "ai_art_tech-painter.html";
    }

    @RequestMapping("/ai_art_tech-rule.html")
    public String ruleWeb() {
        return "ai_art_tech-rule.html";
    }

    @RequestMapping("/ai_art_tech-videoSound.html")
    public String videoSoundWeb(Model model) {
        String[] filePathAry = getFilePathAry("/assets/images/作品/顯相環聲_videoSound/");
        model.addAttribute("filePathAry", filePathAry);
        return "ai_art_tech-videoSound.html";
    }

    @RequestMapping("/buildingPage.html")
    public String buildingPage() {
        return "buildingPage.html";
    }

    @RequestMapping("/contact.html")
    public String contactPage() {
        return "contact.html";
    }

    @RequestMapping("/projects.html")
    public String projectsWeb() {
        return "projects.html";
    }

    public String[] getFilePathAry(String fileDir) {
        String localPath = "";
        ArrayList<String> filePathAry = new ArrayList<String>();
        try {
            localPath = ResourceUtils.getURL("classpath:").getPath() + "static" + fileDir;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File file = new File(localPath);
        File[] files = file.listFiles();
        if (files != null) {
            for (File value : files) {
                filePathAry.add("." + fileDir + value.getName());
            }
        }
        return filePathAry.toArray(new String[0]);
    }
}
