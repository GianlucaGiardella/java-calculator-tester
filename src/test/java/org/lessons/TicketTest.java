package org.lessons;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TicketTest {
    @Test
    @DisplayName("check constructor")
    void constructorCheck() throws  IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(1, 0));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(0, 0));
    }

    @Test
    @DisplayName("base ticket")
    void baseTicket() {
        Ticket ticket = new Ticket(100, 40);
        assertEquals(100 * 0.21, ticket.calculatePrice());
    }

    @Test
    @DisplayName("under 18 ticket")
    void ticketU18() {
        Ticket ticket = new Ticket(100, 16);
        assertEquals((100 * 0.21) * 0.8, ticket.calculatePrice());
    }

    @Test
    @DisplayName("over 65 ticket")
    void ticketO65() {
        Ticket ticket = new Ticket(100, 80);
        assertEquals((100 * 0.21) * 0.6, ticket.calculatePrice());
    }

}