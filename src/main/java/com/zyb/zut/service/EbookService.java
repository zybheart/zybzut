package com.zyb.zut.service;

import com.zyb.zut.domain.Ebook;
import com.zyb.zut.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
