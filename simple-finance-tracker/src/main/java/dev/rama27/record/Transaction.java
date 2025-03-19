package dev.rama27.record;

import dev.rama27.enums.Category;
import dev.rama27.enums.TransactionType;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public record Transaction(UUID id, Date date, double amount, TransactionType type, Category category, String description) {
}
