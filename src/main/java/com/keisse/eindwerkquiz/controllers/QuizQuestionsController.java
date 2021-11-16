package com.keisse.eindwerkquiz.controllers;

import com.keisse.eindwerkquiz.models.QuizQuestion;
import com.keisse.eindwerkquiz.services.QuizQuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//todo: controller mapping

@Controller
public class QuizQuestionsController {

    private final QuizQuestionService quizQuestionService;

    public QuizQuestionsController(QuizQuestionService quizQuestionService){
        this.quizQuestionService = quizQuestionService;
    }

    @RequestMapping("/")
    public String viewQuizQuestions(Model model) {
        List<QuizQuestion> quizQuestions = quizQuestionService.findAll();
        model.addAttribute("quizquestions", quizQuestions);
        return "index";
    }

    @RequestMapping("/new")
    public String newQuizQuestions(Model model) {
        QuizQuestion quizQuestion = new QuizQuestion();
        model.addAttribute(quizQuestion);
        return "new_quizquestion";
    }

    @PostMapping("save")
    public String saveQuizQuestions(@ModelAttribute("quizquestion") QuizQuestion quizQuestion) {
        quizQuestionService.save(quizQuestion);
        return "redirect:/";
    }

    @RequestMapping("edit/{id}")
    public String showEditQuizQuestions(@PathVariable(name = "id") Long id, Model model) {
        model.addAttribute("quizquestions", quizQuestionService.findById(id));
        return "edit_quizquestions";
    }

    @RequestMapping("delete/{id}")
    public String deleteQuizQuestions(@PathVariable(name = "id") Long id) {
        quizQuestionService.deleteById(id);
        return "redirect:/";
    }
}
