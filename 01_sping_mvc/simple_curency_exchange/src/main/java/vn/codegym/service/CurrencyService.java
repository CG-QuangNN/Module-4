package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.repository.ICurrencyRepository;

@Service
public class CurrencyService implements ICurrencyService {
    @Autowired
    ICurrencyRepository currencyRepository;

    @Override
    public double convert(double usd, double rate) {
        return currencyRepository.convert(usd, rate);
    }
}
