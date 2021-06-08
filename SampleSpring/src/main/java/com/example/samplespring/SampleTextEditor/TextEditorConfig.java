package com.example.samplespring.SampleTextEditor;

import com.example.samplespring.SampleTextEditor.SpellChecker;
import com.example.samplespring.SampleTextEditor.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
