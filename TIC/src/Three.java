public class Three {
    public static void three(String[][] board) {
        boolean com = false;
        board[2][2] = "[ X ]";
        Board.BoardReader(board);
        board[1][1] = "[ O ]";
        Board.BoardReader(board);
        int ch1 = backHand.here();
        if (ch1 == 8) {
            board[0][1] = "[ X ]";
            Board.BoardReader(board);
            board[0][0] = "[ O ]";
            Board.BoardReader(board);
            ch1 = backHand.here();
            if (ch1 == 1) {
                board[2][0] = "[ X ]";
                Board.BoardReader(board);
                board[2][1] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 4) {
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[1][2] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[0][2] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 9) {
                    board[0][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[1][2] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                } else {
                    board[1][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][2] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                }
            } else if (ch1 == 9) {
                board[0][2] = "[ X ]";
                Board.BoardReader(board);
                board[1][2] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 4) {
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][0] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[2][1] = "[ x ]";
                    Board.BoardReader(board);
                } else if (ch1 == 1) {
                    board[2][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[1][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 2) {
                    board[2][21] = "[ X ]";
                    Board.BoardReader(board);
                    board[1][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                }
            } else if (ch1 == 6) {
                board[1][2] = "[ X ]";
                Board.BoardReader(board);
                board[0][2] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 1) {
                    board[2][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][1] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 4) {
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 2) {
                    board[2][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                }
            } else if (ch1 == 2) {
                board[2][1] = "[ X ]";
                Board.BoardReader(board);
                board[2][0] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 9) {
                    board[0][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[1][2] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 4) {
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][2] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 6) {
                    board[1][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][2] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                }
            } else if (ch1 == 4) {
                board[1][0] = "[ X ]";
                Board.BoardReader(board);
                board[0][2] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 1) {
                    board[2][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][1] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[1][2] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 2) {
                    board[2][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 6) {
                    board[1][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                }
            }
        } else if (ch1 == 7) {
            board[0][0] = "[ X ]";
            Board.BoardReader(board);
            board[0][1] = "[ O ]";
            Board.BoardReader(board);
            ch1 = backHand.here();
            if (ch1 == 2) {
                board[2][1] = "[ X ]";
                Board.BoardReader(board);
                board[2][0] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 9) {
                    board[0][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[1][2] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 4) {
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][2] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 6) {
                    board[1][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][2] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                }
            } else if (ch1 == 1) {
                board[2][0] = "[ X ]";
                Board.BoardReader(board);
                board[2][1] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 4) {
                board[1][0] = "[ X ]";
                Board.BoardReader(board);
                board[2][1] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 9) {
                board[0][2] = "[ X ]";
                Board.BoardReader(board);
                board[2][1] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 6) {
                board[1][2] = "[ X ]";
                Board.BoardReader(board);
                board[2][1] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            }
        } else if (ch1 == 4) {
            board[1][0] = "[ X ]";
            Board.BoardReader(board);
            board[0][0] = "[ O ]";
            Board.BoardReader(board);
            ch1 = backHand.here();
            if (ch1 == 8) {
                board[0][1] = "[ X ]";
                Board.BoardReader(board);
                board[0][2] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 1) {
                    board[2][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][1] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[1][2] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 2) {
                    board[2][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 6) {
                    board[1][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                }
            } else if (ch1 == 6) {
                board[1][2] = "[ X ]";
                Board.BoardReader(board);
                board[0][2] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 8) {
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 1) {
                    board[2][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][1] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 2) {
                    board[2][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                }
            } else if (ch1 == 1) {
                board[2][0] = "[ X ]";
                Board.BoardReader(board);
                board[2][1] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 8) {
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][2] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[1][2] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 9) {
                    board[0][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][1] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 6) {
                    board[1][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][1] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                }
            } else if (ch1 == 2) {
                board[2][1] = "[ X ]";
                Board.BoardReader(board);
                board[2][0] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 9) {
                    board[0][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[1][2] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 8) {
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][2] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 6) {
                    board[1][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][2] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                }
            } else if (ch1 == 9) {
                board[0][2] = "[ X ]";
                Board.BoardReader(board);
                board[1][2] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 8) {
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][1] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[2][0] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 1) {
                    board[2][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][1] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 2) {
                    board[2][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][0] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                }
            }
        } else if (ch1 == 6) {
            board[1][2] = "[ X ]";
            Board.BoardReader(board);
            board[0][2] = "[ O ]";
            Board.BoardReader(board);
            ch1 = backHand.here();
            if (ch1 == 1) {
                board[2][0] = "[ X ]";
                Board.BoardReader(board);
                board[2][1] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 8) {
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][0] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[1][0] = "[ x ]";
                    Board.BoardReader(board);
                } else if (ch1 == 4) {
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][1] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 7) {
                    board[0][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][1] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                }
            } else if (ch1 == 7) {
                board[0][0] = "[ X ]";
                Board.BoardReader(board);
                board[2][0] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 8) {
                board[0][1] = "[ X ]";
                Board.BoardReader(board);
                board[2][0] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 4) {
                board[1][0] = "[ X ]";
                Board.BoardReader(board);
                board[2][0] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 2) {
                board[2][1] = "[ X ]";
                Board.BoardReader(board);
                board[2][0] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            }
        } else if (ch1 == 1) {
            board[2][0] = "[ X ]";
            Board.BoardReader(board);
            board[2][1] = "[ O ]";
            Board.BoardReader(board);
            ch1 = backHand.here();
            if (ch1 == 8) {
                board[0][1] = "[ X ]";
                Board.BoardReader(board);
                board[0][0] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 4) {
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[1][2] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[0][2] = "[ x ]";
                    Board.BoardReader(board);
                } else if (ch1 == 6) {
                    board[1][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][2] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[1][0] = "[ x ]";
                    Board.BoardReader(board);
                } else if (ch1 == 9) {
                    board[0][2] = "[ X ]";
                    Board.BoardReader(board);
                    board[1][2] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[1][0] = "[ x ]";
                    Board.BoardReader(board);
                }
            } else if (ch1 == 4) {
                board[1][0] = "[ X ]";
                Board.BoardReader(board);
                board[0][1] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 7) {
                board[0][0] = "[ X ]";
                Board.BoardReader(board);
                board[0][1] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 6) {
                board[1][2] = "[ X ]";
                Board.BoardReader(board);
                board[0][1] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 9) {
                board[0][2] = "[ X ]";
                Board.BoardReader(board);
                board[0][1] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            }
        } else if (ch1 == 2) {
            board[2][1] = "[ X ]";
            Board.BoardReader(board);
            board[2][0] = "[ O ]";
            Board.BoardReader(board);
            ch1 = backHand.here();
            if (ch1 == 9) {
                board[0][2] = "[ X ]";
                Board.BoardReader(board);
                board[1][2] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 4) {
                    board[1][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[0][0] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 8) {
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[1][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                } else if (ch1 == 7) {
                    board[0][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[1][0] = "[ O ]";
                    Board.BoardReader(board);
                    com = true;
                }
            } else if (ch1 == 8) {
                board[2][0] = "[ X ]";
                Board.BoardReader(board);
                board[0][2] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 7) {
                board[0][0] = "[ X ]";
                Board.BoardReader(board);
                board[0][2] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 4) {
                board[1][0] = "[ X ]";
                Board.BoardReader(board);
                board[0][2] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 6) {
                board[1][2] = "[ X ]";
                Board.BoardReader(board);
                board[0][2] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            }
        } else if (ch1 == 9) {
            board[0][2] = "[ X ]";
            Board.BoardReader(board);
            board[1][2] = "[ O ]";
            Board.BoardReader(board);
            ch1 = backHand.here();
            if (ch1 == 4) {
                board[1][0] = "[ X ]";
                Board.BoardReader(board);
                board[0][0] = "[ O ]";
                Board.BoardReader(board);
                ch1 = backHand.here();
                if (ch1 == 8) {
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][1] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[2][0] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 2) {
                    board[2][1] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][0] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                } else if (ch1 == 1) {
                    board[2][0] = "[ X ]";
                    Board.BoardReader(board);
                    board[2][1] = "[ O ]";
                    Board.BoardReader(board);
                    backHand.here();
                    board[0][1] = "[ X ]";
                    Board.BoardReader(board);
                }
            } else if (ch1 == 8) {
                board[0][1] = "[ X ]";
                Board.BoardReader(board);
                board[1][0] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 7) {
                board[0][0] = "[ X ]";
                Board.BoardReader(board);
                board[1][0] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 1) {
                board[2][0] = "[ X ]";
                Board.BoardReader(board);
                board[1][0] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            } else if (ch1 == 2) {
                board[2][1] = "[ X ]";
                Board.BoardReader(board);
                board[1][0] = "[ O ]";
                Board.BoardReader(board);
                com = true;
            }
        }

        if (com) {
            backHand.Sleep(1.0);
            SimpleAudioPlayer.playGameLoss();
            System.out.println("\n\n\t\tSAURAV THE GREAT WON");
        } else {
            backHand.Sleep(0.5);
            SimpleAudioPlayer.playGameDraw();
            System.out.println("\n\n\t\tIT'S A DRAW");
        }

        Game.counter(com);
    }
}